import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ClassInspect will take in a class, and list information about it.
 */
public class ClassInspector {

    public static void printAllClassInformation(Class<?> clazz) throws Exception {
        listPublicConstructors(clazz);
        listNonPublicConstructors(clazz);
        listPublicFields(clazz);
        listNonPublicFields(clazz);
        listPublicMethods(clazz);
        listNonPublicMethods(clazz);

        throw new Exception();
    }

    public static void listPublicConstructors(Class<?> clazz){
        System.out.println("Printing the public constructors of the " + clazz.getName());

        Constructor<?>[] constructors = clazz.getConstructors();

        for(Constructor<?> constructor : constructors){
            System.out.println("\tConstructor name: " + constructor.getName());
            System.out.println("\tConstructor param types: " + Arrays.toString(constructor.getParameterTypes()));
            System.out.println("\tConstructor type name: " + constructor.getClass().getTypeName());
            System.out.println();
        }
    }

    public static void listPublicFields(Class<?> clazz) {
        System.out.println("Printing the public fields of the " + clazz.getName());

        Field[] fields = clazz.getFields(); // limited to fields that are publicly visible

        for(Field field: fields){
            System.out.println("\tField name: " + field.getName());
            System.out.println("\tField type: " + field.getType());
            System.out.println("\tIs field primitive: " + field.getType().isPrimitive());
            System.out.println("\tModifiers bit value: " + Integer.toBinaryString(field.getModifiers()));
            System.out.println();
        }

    }

    public static void listNonPublicFields(Class<?> clazz) {
        System.out.println("Printing the non public fields of the " + clazz.getName());

        Field[] fields = clazz.getDeclaredFields(); // get all fields regardless of visibility
        for(Field field : fields){
            if(field.getModifiers() == Modifier.PUBLIC){
                continue;
            }
            System.out.println("\tField name: " + field.getName());
            System.out.println("\tField type: " + field.getType());
            System.out.println("\tIs field primitive: " + field.getType().isPrimitive());
            System.out.println("\tModifiers bit value: " + Integer.toBinaryString(field.getModifiers()));
            System.out.println("\tModifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }
    }


    public static void listNonPublicConstructors(Class<?> clazz) {
        System.out.println("Printing the private constructors of the " + clazz.getName());

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for(Constructor<?> constructor : constructors){
            if(constructor.getModifiers() == Modifier.PUBLIC){
                continue;
            }
            System.out.println("\tConstructor name: " + constructor.getName());
            System.out.println("\tConstructor param types: " + Arrays.toString(constructor.getParameterTypes()));
            System.out.println("\tConstructor type name: " + constructor.getClass().getTypeName());
            System.out.println("\tModifiers: " + Modifier.toString(constructor.getModifiers()));
            System.out.println();
        }
    }


    public static void listPublicMethods(Class<?> clazz) {
        System.out.println("Printing the public methods of the " + clazz.getName());

        Method[] methods = clazz.getMethods();

        for(Method method : methods){
            System.out.println("\tMethod name: " + method.getName());
            System.out.println("\tMethod type: " + method.getReturnType());
            System.out.println("\tModifiers: " + Modifier.toString(method.getModifiers()));
            System.out.println("\tDeclaring class: " + method.getDeclaringClass().getName());
            System.out.println("\tDeclared annotations: " + Arrays.toString(method.getDeclaredAnnotations()));

            Parameter[] parameters = method.getParameters();
            //Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println("\tParameter count: " + parameters.length);

            for(Parameter parameter: parameters){
                System.out.println("\tParameter name: " + parameter.getName());
                System.out.println("\tParameter type: " + parameter.getType());
                System.out.println("\tParameter annotations: " + Arrays.toString(parameter.getAnnotations()));
            }

            System.out.println();
        }

    }

    public static void listNonPublicMethods(Class<?> clazz) {
        System.out.println("Printing the non public methods of the " + clazz.getName());

        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods){
            if(Modifier.isPublic(method.getModifiers())) continue;
            System.out.println("\tMethod name: " + method.getName());
            System.out.println("\tMethod type: " + method.getReturnType());
            System.out.println("\tModifiers: " + Modifier.toString(method.getModifiers()));
            System.out.println("\tDeclaring class: " + method.getDeclaringClass().getName());
            System.out.println("\tDeclared annotations: " + Arrays.toString(method.getDeclaredAnnotations()));

            Parameter[] parameters = method.getParameters();
            //Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println("\tParameter count: " + parameters.length);

            for(Parameter parameter: parameters){
                System.out.println("\tParameter name: " + parameter.getName());
                System.out.println("\tParameter type: " + parameter.getType());
                System.out.println("\tParameter annotations: " + Arrays.toString(parameter.getAnnotations()));
            }

            System.out.println();
        }

    }
}
