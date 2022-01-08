package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        return number <= 10 ? number : number - 10;
    }

    public String describeNumber(int number) {
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name) {
        return "Joe".equals(name) ? "Hello " + name : "";
    }

    public int calculateBonus(int sale) {
        return sale >= 1_000_000 ? sale / 10 : 0;
    }

    public int calculateConsumption(int prev, int next) {
        int result;
        if (next >= prev) {
            result = next - prev;
        } else {
            result = 9999 - prev + next;
        }
        return result;
    }

    public void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i = i + 2) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
}
