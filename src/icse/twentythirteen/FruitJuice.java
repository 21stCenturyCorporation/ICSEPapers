package icse.twentythirteen;

import java.util.*;

public class FruitJuice {
    int product_code, pack_size, product_price, amt;
    String flavour, pack_type;
    FruitJuice() {
        product_code = 0; pack_size = 0; amt = 0; product_price = 0;
        flavour = ""; pack_type = "";
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code, pack size, flavour, pack type and product price: ");
        product_code = sc.nextInt();
        pack_size = sc.nextInt();
        sc.nextLine();  // This line is created because of the problem of sc.nextLine() that it goes to the next Line. So if this was not added then the sc.nextLine in line 21 will not take input and go to the next line. My java version is 1.8 and getting this error, so this is how I solve it.
        flavour = sc.nextLine();
        pack_type = sc.nextLine();
        product_price = sc.nextInt();
    }
    void discount() {
        int d = 10;
        amt = product_price - d;
    }
    void display() {
        System.out.println("Product Code: "+product_code+" Flavour: "+flavour+" Pack Type: "+pack_type+"\nPack Size: "+pack_size+"ml Product Price: "+product_price + " Discounted Price: "+amt);
    }
    public static void main(String[] args) {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}
