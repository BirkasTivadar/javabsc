package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";

        String message = prefix + name;

        message = message + 444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String twoEmpty = "" + "";
        System.out.println(twoEmpty);
        System.out.println(twoEmpty.length());

        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.substring(0, 1) + ", " + abcde.substring(2, 3));
        System.out.println(abcde.substring(0, 3));

    }

}
