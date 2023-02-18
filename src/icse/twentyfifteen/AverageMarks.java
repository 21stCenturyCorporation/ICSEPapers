package icse.twentyfifteen;

import java.util.*;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] roll = new int[n];
        int[] sub1 = new int[n];
        int[] sub2 = new int[n];
        int[] sub3 = new int[n];
        double[] avg = new double[n];
        for(int i = 0;i < n;i++){
            System.out.println("Enter the name of the student: ");
            name[i] = sc.next();

            System.out.println("Enter the roll number of student: ");
            roll[i] = sc.nextInt();

            System.out.println("Enter the marks in three subjects out of 100: ");
            sub1[i] = sc.nextInt();
            sub2[i] = sc.nextInt();
            sub3[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++){
            avg[i] = (double) (sub1[i] + sub2[i] + sub3[i]) / 3.0;
            System.out.println(avg[i]);
            if (avg[i] < 40){
                System.out.println("Name: "+name[i] + " Roll no.: "+roll[i]+" Remark: Poor");
            }
            else if(avg[i] >= 40 && avg[i] <= 59) {
                System.out.println("Name: "+name[i] + " Roll no.: "+roll[i]+" Remark: Pass");
            }
            else if(avg[i] >= 60 && avg[i] <= 74) {
                System.out.println("Name: "+name[i] + " Roll no.: "+roll[i]+" Remark: First Class");
            }
            else if(avg[i] >= 75 && avg[i] <= 84) {
                System.out.println("Name: "+name[i] + " Roll no.: "+roll[i]+" Remark: Distinction");
            }
            else if (avg[i] >= 85 && avg[i] <= 100) {
                System.out.println("Name: "+name[i] + " Roll no.: "+roll[i]+" Remark: Excellent");
            }
        }
    }
}
