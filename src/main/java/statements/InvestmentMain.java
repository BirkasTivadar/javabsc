package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a befektetendő összeget:");
        int fund = scanner.nextInt();
        System.out.println("Kérem a kamatlábat:");
        int interestRate = scanner.nextInt();
        System.out.println("Hány napra szeretné megnézni a hozamot?");
        int days = scanner.nextInt();
        System.out.println("Hány nap után szeretné kivenni az összeget?");
        int closeDays = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("\nBefektetés összege:");
        System.out.println(investment.getFund());
        System.out.println("Kamatláb:");
        System.out.println(investment.getInterestRate());
        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam " + days + " napra: " + investment.getYield(days));
        System.out.println("Kivett összeg " + closeDays + " nap után: " + investment.close(closeDays));
        System.out.println("Kivett össze " + (closeDays + 10) + " nap után: " + investment.close(closeDays + 10));


    }
}
