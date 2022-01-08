package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(3));
        System.out.println(introControl.subtractTenIfGreaterThanTen(15));

        System.out.println(introControl.describeNumber(2));
        System.out.println(introControl.describeNumber(0));

        System.out.println(introControl.greetingToJoe("Bibó"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(999999));
        System.out.println(introControl.calculateBonus(1000120));

        System.out.println(introControl.calculateConsumption(3456,6789));
        System.out.println(introControl.calculateConsumption(9001,132));

        introControl.printNumbers(56);
        introControl.printNumbersBetween(56, 61);
        introControl.printNumbersBetweenAnyDirection(5,10);
        introControl.printNumbersBetweenAnyDirection(25,19);

        introControl.printOddNumbers(6);
        introControl.printNumbers(9);

    }
}
