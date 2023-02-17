package icse.twentysixteen;

import java.util.*;

public class PalinSpecial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        String reverse = "";
        int last = word.length() - 1;
        for(int i = word.length() - 1; i >= 0;i--){
            reverse = reverse + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a Palindrome and a special word");
        }
        else if (word.charAt(0) == word.charAt(last)){
            System.out.println(word + " is a Special word only.");
        }
        else
            System.out.println(word + " is neither a Palindrome nor a Special word.");
    }
}
