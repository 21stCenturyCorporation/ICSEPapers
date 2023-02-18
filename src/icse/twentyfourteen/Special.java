package icse.twentyfourteen;

import java.util.*;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two-digit number: ");
        int n = sc.nextInt();
        int cp = n, dig = 0, s = 0, p = 1;
        while (cp > 0){
            dig = cp % 10;
            s += dig;
            p *= dig;
            cp = cp / 10;
        }
        int ts = s + p;
        if(ts == n) {
            System.out.println(n + " is a two digit special number");
        }
        else
            System.out.println(n + " is not a two digit special number");
    }
}
