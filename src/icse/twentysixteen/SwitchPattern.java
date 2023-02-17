package icse.twentysixteen;

import java.util.*;

public class SwitchPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for pattern1 and 2 for pattern2: ");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int x = 1, i1, j1;
                for(i1 = 0;i1 < 5;i1++){
                    for(j1 = 0;j1 <= i1;j1++){
                        System.out.print(x + " ");
                        x++;
                    }
                    System.out.println();
                }
                break;

            case 2:
                String s = "ICSE";
                int i2, j2;
                for(i2 = 0;i2 < s.length();i2++){
                    for(j2 = 0;j2 <= i2;j2++){
                        System.out.print(s.charAt(j2) + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Wrong Input");
        }
    }
}
