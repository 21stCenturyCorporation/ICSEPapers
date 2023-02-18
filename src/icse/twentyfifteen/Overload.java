package icse.twentyfifteen;

import java.util.Scanner;

public class Overload {
    public static void Joystring(String s, char ch1, char ch2) {
        String result = s.replace(ch1, ch2);
        System.out.println("The resultant string is: "+result);
    }
    public static void Joystring(String s){
        int findex = s.indexOf(" ");
        int lindex = s.lastIndexOf(" ");
        System.out.println("The first index of the whitespace character is: "+findex+" and the last index is: "+lindex);
    }
    public static void Joystring(String s1, String s2){
        String result = s1 + " " + s2;
        System.out.println("The resultant string is: "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of s, ch1 and ch2: ");
        String s = sc.next();
        char ch1 = (sc.next().charAt(0));
        char ch2 = sc.next().charAt(0);

        sc.nextLine(); // This is done so that the input is taken on line 29 otherwise, that input will be skipped. I have actually searched this on Google and that's practically correct.

        System.out.println("Enter a different value of S: ");
        String S = sc.nextLine();

        System.out.println("Enter the value of s1 and s2: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        Joystring(s, ch1, ch2);
        Joystring(S);
        Joystring(s1, s2);
    }
}
