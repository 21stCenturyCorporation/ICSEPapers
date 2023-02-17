package icse.twentysixteen;

import java.util.Scanner;

public class BookFair {
    String Bname;
    double price, amt;
    BookFair() {
        Bname = "";
        price = 0.0;
        amt = 0.0;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book and price: ");
        Bname = sc.nextLine();
        price = sc.nextDouble();
    }
    void calculate() {
        double d;
        if(price <= 1000)
            d = (2.0 / 100.0) * price;
        else if(price <= 3000)
            d = (10.0 / 100.0) * price;
        else
            d = (15.0 / 100.0) * price;
        amt = price - d;
    }
    void display() {
        System.out.println("The name of the book is: "+Bname);
        System.out.println("The price of the book after discount: "+amt);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
