package icse.twentyfourteen;

import java.util.*;

public class OverloadArea {
    public static double area(double a, double b, double c){
        double s, result;
        s = (a + b + c) / 2.0;
        result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return result;
    }
    public static double area(int a, int b, int height){
        double area;
        area = (height * (a + b)) / 2.0;
        return area;
    }
    public static double area(double diagonal1, double diagonal2){
        double area;
        area = (diagonal1 * diagonal2) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle: ");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();

        System.out.println("Enter the value of a, b and the height: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("Enter the two diagonals of a rhombus: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        double ans1 = area(l1, l2, l3);
        double ans2 = area(a, b, height);
        double ans3 = area(d1, d2);

        System.out.println("The area of the scalene triangle is: "+ans1);
        System.out.println("The area of the trapezium is: "+ans2);
        System.out.println("The area of the rhombus is: "+ans3);
    }
}