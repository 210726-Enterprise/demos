import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

        try {
            ClassInspector.printAllClassInformation(Runnable.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //User u = new User();
        Constructor<?>[] constructors = User.class.getConstructors();


        User u = (User) Arrays.stream(constructors).filter(c -> c.getParameterCount() == 0)
                .findFirst()
                .orElseThrow(RuntimeException::new).newInstance();

        Method[] userMethods = User.class.getDeclaredMethods();

        System.out.println(Arrays.toString(userMethods));

        List<Method> setters = Arrays.stream(userMethods)
                .filter(m -> m.getName().startsWith("set"))
                .collect(Collectors.toList());

        setters.forEach(setter -> {
            if(setter.getName().equals("setUsername")){
                try {
                    setter.invoke(u, "username");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    setter.invoke(u, "password");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

//        setters.get(0).invoke(u, "username");
//        setters.get(1).invoke(u, "password");

        System.out.println(u);


        Method method = Arrays.stream(User.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("printSomething"))
                .findFirst()
                .orElseThrow(RuntimeException::new);

        try{
            method.setAccessible(true);
            method.invoke(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
