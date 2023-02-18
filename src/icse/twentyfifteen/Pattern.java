package icse.twentyfifteen;

import java.util.*;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for pattern1 else 2 for pattern2: ");
		System.out.println("Enter your choice:  ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			char ch1 = '*', ch2 = '#';
			for(int i = 0;i < 5;i++) {
				for(int j = 0;j <= i;j++) {
					if (j % 2 == 0) {
						System.out.print(" "+ch2+" ");
					}
					else {
						System.out.print(ch1 + " ");
					}
				}
				System.out.println();
			}
			break;
			
		case 2:
			for(int i = 1;i <= 5;i++) {
				for(int j = 5;j >= i;j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}

		default:
			System.out.println("Wrong Choice");
			break;
		}
		
	}
}
