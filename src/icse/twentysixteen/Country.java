package icse.twentysixteen;

import java.util.*;

public class Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] con = new String[7];
        String[] wonder = new String[7];
        for(int i = 0;i < 7;i++){
            System.out.println("Enter the country: ");
            con[i] = sc.nextLine();
            System.out.println("Enter the Wonder it has: ");
            wonder[i] = sc.nextLine();
            System.out.println();
        }
        System.out.println("Enter the name of the Country: ");
        String name = sc.nextLine();
        int flag = 0, pos = 0;
        for(int i = 0;i < con.length;i++){
            if (con[i].equalsIgnoreCase(name)){
                flag = 1;
                pos = i;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Country: "+con[pos] + "\n"+"Wonder it has: "+wonder[pos]);
        else
            System.out.println("The Country has no wonders");
    }
}
