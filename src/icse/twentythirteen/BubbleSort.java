package icse.twentythirteen;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i = 0;i < n - 1;i++){
            for(int j = 0;j < n - i - 1;j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The array in descending order: ");
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
