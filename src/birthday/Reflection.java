package birthday;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection  {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Main main = new Main();

        Class<? extends Main> aClass = main.getClass();

        System.out.println(aClass);

        Class<Integer> integerClass = Integer.class;

        System.out.println(integerClass);

        Class<Main> mainClass = Main.class;

        System.out.println(mainClass);

        Class c = Class.forName("birthday.OwnJoiner");

        System.out.println("package: " + c);

        Class clazz = c.getClass();

        String str = clazz.getName();

        System.out.println(str);

        int modf = clazz.getModifiers();

        if (Modifier.isPublic(modf)) {
            System.out.println("modifiers: Public");
        }
        if (Modifier.isPrivate(modf)) {
            System.out.println("modifiers: Private");
        }
        if (Modifier.isAbstract(modf)) {
            System.out.println("modifiers: Abstract");
        }

        Class superclass = clazz.getSuperclass();

        System.out.println(superclass);

        Field[] fields = clazz.getFields();

        Method method[] = clazz.getMethods();

        for (Method methods : method) {
            System.out.println(methods.getReturnType());
        }
    }
}

class PriFrom {

    private final int FIRST = 12;
    private int first = 12;

    private final String JAVA = "1995";
    private String java = "1995";

    public String getJAVA() {
        return FIRST + " " + first + " " + JAVA + " " + java;
    }
}

class PriTo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        PriFrom from = new PriFrom();

        final String java = from.getJAVA();
        System.out.println(java);
        System.out.println();

        Field field = from.getClass().getDeclaredField("FIRST");
        field.setAccessible(true);
        field.setInt(from, 23);
        System.out.print(from + " ");

        field = from.getClass().getDeclaredField("first");
        field.setAccessible(true);
        field.setInt(from, 17);
        System.out.print(from + " ");

        field = from.getClass().getDeclaredField("JAVA");
        field.setAccessible(true);
        field.set(from, "Igor");
        System.out.println(from + " ");

        field = from.getClass().getDeclaredField("java");
        field.setAccessible(true);
        field.set(from, "Tatyana");
        System.out.print(from);

    }
}