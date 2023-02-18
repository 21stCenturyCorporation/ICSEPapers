package icse.twentyfifteen;

import java.util.*;

public class BubbleSortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // Change the number according to your wish. The program will run the same
        System.out.println("Enter the names of the students: ");
        String[] names = new String[n];
        for(int i = 0;i < n;i++){
            names[i] = sc.nextLine();
        }
        String t;
        for (int i = 0;i < n-1;i++){
            for(int j = 0;j < n-i-1;j++){
                if (names[j].compareToIgnoreCase(names[j+1]) < 0) {
                    t = names[j];
                    names[j] = names[j+1];
                    names[j+1] = t;
                }
            }
        }
        System.out.println("The names in descending order: ");
        for (int i = 0;i < n;i++){
            System.out.print(names[i] + " ");
        }
    }
}
