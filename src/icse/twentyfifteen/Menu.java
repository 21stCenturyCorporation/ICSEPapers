package icse.twentyfifteen;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1) for finding the factors of a number and (2) for finding the factorial of a number: ");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter a number: ");
                int n1 = sc.nextInt();
                for (int i = 1;i < n1;i++){
                    if (n1 % i == 0){
                        System.out.print(i + " ");
                    }
                }
                break;

            case 2:
                System.out.println("Enter a number: ");
                int n2 = sc.nextInt();
                int f = 1;
                for(int i1 = 1;i1 <= n2;i1++){
                    f = f * i1;
                }
                System.out.println("Factorial of number "+n2+" is: "+f);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}
