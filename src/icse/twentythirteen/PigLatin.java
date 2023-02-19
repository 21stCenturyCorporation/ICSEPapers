package icse.twentythirteen;

import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        word = word.toUpperCase();
        String first_index = "", last_index = "";
        for (int i = 0;i < word.length();i++){
            if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U'){
                first_index = word.substring(0,i);
                last_index = word.substring(i);
                break;
            }
        }
        String result = last_index + first_index + "AY";
        System.out.println("The Piglatin word is: "+result);
    }
}
