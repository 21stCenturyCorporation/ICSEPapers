package icse.twentysixteen;

import java.util.*;

public class Overload {
    public static void SumSeries(int n, double x) {
        double s = 0.0, t;
        for(int i = 1;i <= n;i++) {
            t = (double) x / i;
            if(i % 2 == 0)
                s -= t;
            else
                s += t;
        }
        System.out.println("The sum of the series is: "+s);
    }
    public static void SumSeries() {
        int s = 0, n = 5;
        long f;
        for(int i = 1; i <= n;i++){
            f = 1;
            for(int j = 1;j <= i;j++){
                f = f * j;
            }
            s += f;
        }
        System.out.println("The sum of the series is: "+s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and x: ");
        int n = sc.nextInt();
        double x = sc.nextDouble();
        SumSeries(n, x);
        SumSeries();
    }
}
