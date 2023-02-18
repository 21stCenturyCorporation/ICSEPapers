package icse.twentyfourteen;

import java.util.*;

public class FilePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filepath of a file: ");
        String filepath = sc.nextLine();
        String filename = "", extension = "", path = "";
        int r = filepath.lastIndexOf("/");
        int s = filepath.indexOf(".");
        filename = filepath.substring(r+1, s);
        extension = filepath.substring(s+1);
        path = filepath.substring(0, r+1);
        System.out.println("Path: "+path);
        System.out.println("Filename: "+filename);
        System.out.println("Extension: "+extension);
    }
}
