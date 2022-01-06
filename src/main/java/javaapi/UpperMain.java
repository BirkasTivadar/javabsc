package javaapi;

public class UpperMain {

    public static void main(String[] args) {
        Upper upper = new Upper();

        String text = "Hello World";

        System.out.println(upper.getUpper(text));
    }
}
