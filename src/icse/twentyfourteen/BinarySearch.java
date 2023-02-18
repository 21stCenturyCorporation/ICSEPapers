package icse.twentyfourteen;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the graduation year of the student: ");
        int year = sc.nextInt();
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        int lb = 0, ub = years.length - 1, pos = 0, mid = 0, flag = 0;
        while (lb <= ub){
            mid = (lb + ub) / 2;
            if (year > years[mid])
                lb = mid + 1;
            else if(year < years[mid])
                ub = mid - 1;
            else{
                pos = mid;
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Record Exists!!");
        }
        else
            System.out.println("Record Does not Exist!!");
    }
}
