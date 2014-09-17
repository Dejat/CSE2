// Java Root
//Tyler DeJarnett

import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in );
        System.out.print("Enter Number: ");
        double x = myScanner.nextInt();
        double guess = x/3;
        double xRoot = (guess*guess*guess+x)/(3*guess*guess);
        System.out.println("The cube root is " + xRoot);
        
    }
}