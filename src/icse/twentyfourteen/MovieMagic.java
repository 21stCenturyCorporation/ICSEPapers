package icse.twentyfourteen;

import java.util.*;

public class MovieMagic {
    int year;
    String title, msg;
    float rating;
    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0F;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year in which the movie was released: ");
        year = sc.nextInt();

        sc.nextLine(); // This line is created because of the problem of sc.nextLine() that it goes to the next Line. So if this was not added then the sc.nextLine in line 21 will not take input and go to the next line. My java version is 1.8 and getting this error, so this is how I solve it.
        System.out.println("Enter the title of the movie: ");
        title = sc.nextLine();
        System.out.println("Enter the rating of the movie: ");
        rating = sc.nextFloat();
    }
    void display() {
        boolean flag = false;
        if (rating >= 0.0 && rating <= 2.0)
        {
            flag = true;
            msg = "Flop";
        }
        else if(rating >= 2.1 && rating <= 3.4) {
            flag = true;
            msg = "Semi-hit";
        }
        else if(rating >= 3.5 && rating <= 4.5) {
            flag = true;
            msg = "Hit";
        }
        else if(rating >= 4.6 && rating <= 5.0) {
            flag = true;
            msg = "Super Hit";
        }
        else
        {
            flag = false;
            System.out.println("The Rating should be positive and cannot be more than 5.0");
        }
        if (flag == true){
            System.out.println("The movie "+title+" is a "+msg);
        }
    }
    public static void main(String[] args){
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}
