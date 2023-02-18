package icse.twentyfourteen;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1) for Term Deposit and (2) for Recurring Deposit: ");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the principal, rate of interest and time period in years: ");
                int p = sc.nextInt();
                double r = sc.nextDouble();
                int t = sc.nextInt();
                double amt;
                amt = p * (Math.pow(1 + (r / 100.0), t));
                System.out.println("The amount is: "+amt);
                break;
            case 2:
                System.out.println("Enter the monthly installment, rate of interest, time period in months: ");
                int pr = sc.nextInt();
                double roi = sc.nextDouble();
                int n = sc.nextInt();
                double i, mv;
                i = pr * ((n * (n + 1)) / 2.0) * (roi / 100.0) * (1.0 / 12.0);
                mv = (pr * n) + i;
                System.out.println("The matured value is: "+mv);
                break;
            default:
                System.out.println("Wrong choice!!");
        }
    }
}
