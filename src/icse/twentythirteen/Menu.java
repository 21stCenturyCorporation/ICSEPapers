package icse.twentythirteen;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1) for checking Composite Number and (2) for finding the smallest digit of a number");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter a number: ");
                int n1 = sc.nextInt();
                int c = 0;
                for (int i = 1; i <= n1;i++){
                    if (n1 % i == 0)
                        c++;
                }
                if (c > 2)
                    System.out.println(n1 + " is a Composite Number");
                else
                    System.out.println(n1 + " is not a Composite Number");
                break;
            case 2:
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                int cp = n, dig = 0, min = n;
                while (cp > 0){
                    dig = cp % 10;
                    if (min > dig){
                        min = dig;
                    }
                    cp = cp / 10;
                }
                System.out.println("The smallest integer is: "+min);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}
