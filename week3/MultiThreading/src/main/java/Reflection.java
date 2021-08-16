

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        User u = null;

        Constructor<?> noArgConstructor = null;
        Constructor<?> allArgConstructor = null;
        Constructor<?>[] constructors = User.class.getConstructors();

        u = (User) Arrays.stream(constructors)
                .filter( c -> c.getParameterTypes().length == 0) // grab the no arg constructor
                .findFirst()
                .orElseThrow(RuntimeException::new).newInstance();

        System.out.println(u);

        u = (User) Arrays.stream(constructors)
                .filter(c -> c.getParameterTypes().length == 2)
                .findFirst()
                .orElseThrow(RuntimeException::new).newInstance("something", "else", "indeed");
        System.out.println(u);
    }
}
