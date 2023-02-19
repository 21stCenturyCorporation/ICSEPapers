package icse.twentythirteen;

import java.util.*;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int cp = n, dig = 0,count = 0,s = 0, m = 10;
        while (n > 0) {
            dig = (int) n % 10;
            count++;
            s += dig * m;
            m--;
            n = n / 10;
        }
        if (count != 10) {
            System.out.println("The ISBN code should be of 10 digits");
        }
        else {
            if (s % 11 == 0){
                System.out.println("Legal ISBN code");
            }
            else{
                System.out.println("Illegal ISBN code");
            }
        }
    }
}
