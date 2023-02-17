package icse.twentysixteen;

import java.util.*;

public class Niven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int cp = n, dig = 0, s = 0;
        while (cp > 0) {
            dig = cp % 10;
            s += dig;
            cp = cp / 10;
        }
        if (n % s == 0)
            System.out.println(n + " is a Niven number");
        else
            System.out.println(n + " is not a Niven number");
    }
}
