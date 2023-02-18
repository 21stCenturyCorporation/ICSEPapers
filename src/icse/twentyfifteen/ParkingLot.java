package icse.twentyfifteen;

import java.util.*;

public class ParkingLot {
	int vno, hours;
	double bill;
	
	public ParkingLot() {
		vno = 0; hours = 0;
		bill = 0.0;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle number and the number of hours: ");
		vno = sc.nextInt();
		hours = sc.nextInt();
	}
	
	void calculate() {
		if (vno <= 1) {
			bill = hours * 3;
		}
		else {
			bill = 3 + (hours - 1) * 1.5;
		}
	}
	
	void display() {
		System.out.println("The entered the vehicle number is "+vno+" and the number of hours it has been parked is: "+hours+". Therefore, the bill is: "+bill);
	}
	public static void main(String[] args) {
		ParkingLot obj = new ParkingLot();
		obj.input();
		obj.calculate();
		obj.display();
	}
}