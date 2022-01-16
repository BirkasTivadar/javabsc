package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class PiMain {

    public static final double R = 5.5;
    public static final int H = 3;

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        System.out.println(R + " egység sugarú kör");
        System.out.println("kerülete: " + circleCalculator.calculatePerimeter(R));
        System.out.println("területe: " + circleCalculator.calculateArea(R));
        System.out.println();
        System.out.println(R + " egység sugarú kör és " + H + " egység magasságú cilinder");
        System.out.println("űrtartalma CylinderCalculator alapján: " + cylinderCalculator.calculateVolume(R, H));
        System.out.println("felszíne CylinderCalculator alapján: " + cylinderCalculator.calculateSurfaceArea(R, H));
        System.out.println("űrtartalma CylinderCalculatorBasedOnCircle alapján: " + cylinderCalculatorBasedOnCircle.calculateVolume(R, H));
        System.out.println("felszíne CylinderCalculatorcylinderCalculatorBasedOnCircle alapján: " + cylinderCalculatorBasedOnCircle.calculateSurfaceArea(R, H));
        System.out.println("PI értéke: "+ PI);
    }
}
