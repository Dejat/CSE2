// Java Bicycle
//Tyler DeJarnett

import java.util.Scanner;
public class Bicycle {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in );
        System.out.print("Enter number of seconds: ");
        int nSeconds = myScanner.nextInt();
        System.out.println("Enter number of counts: ");
        int nCount = myScanner.nextInt();
        double dWheel = 0.000426136;
        double lWheel = dWheel * 3.141590
        double distance = lWheel * nCount;
        double speed = distance / (nSeconds * 0.000277778);
        System.out.println("The distance was " + distance + " miles and took " + nSeconds * 0.0166667 + " minutes");
        System.out.println("The average speed was " + speed + " mph");
        
    }
}