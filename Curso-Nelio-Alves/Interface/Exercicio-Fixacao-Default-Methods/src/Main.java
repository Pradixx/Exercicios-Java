import Entities.BrazilInterestRate;
import Entities.InterestRate;
import Entities.UsaInterestRate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestRate br = new BrazilInterestRate(2.0);
        InterestRate us = new UsaInterestRate(1.0);
        double payment1 = br.payment(amount, months);
        double payment2 = us.payment(amount, months);

        System.out.printf("Payment after: %d months: %.2f", months, payment1);
        System.out.println();
        System.out.printf("Payment after: %d months: %.2f", months, payment2);

        sc.close();
    }
}
