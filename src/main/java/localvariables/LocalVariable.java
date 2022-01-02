package localvariables;

public class LocalVariable {

    public static void main(String[] args) {

        boolean b;
//        System.out.println(b);
        b = false;
        System.out.println(b);

        int number = 2;
        System.out.println(number);

        int i = 3, j = 4;
        int k = i;
        System.out.println("i=" + i + ", j=" + j + ", k=" + k);

//        System.out.println(s);
        String s = "Hello World";
        System.out.println(s);

        String t = s;
        System.out.println(t);

//        {
//            int x = 0;
//        }
//        System.out.println(x);

        int a = 0;
        {
            System.out.println(a);
        }
    }
}
