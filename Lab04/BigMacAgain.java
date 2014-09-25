// Big Mac Again
// Tyler DeJarnett

import java.util.Scanner;
public class BigMacAgain {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in );
         System.out.print("Enter number of big macs: ");
        //int nBigMacs = myScanner.nextInt();
        
        if (myScanner.hasnextInt() ) {
            int nBigMacs = myScanner.nextInt();
            price = nBigMacs*2.22;
             System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of $"+price);
        }
        else {
            System.out.println("you did not enter an integer");
            return;
        }
        if (nBigMacs < 0) {
            System.out.println("you entered a number less than zero");
        }
        
        
        System.out.println("Do you want an order of fries (Y/y/N/n)?");
    
        String answer = myScanner.next();
        if (answer.equals("Y") || answer.equals("y")) {
            System.out.println("You ordered fries at a cost of $2.15");
            total = price+2.15;
            System.out.println("The total cost of the meal is: $"+total);
        }
        else if (answer.equals("N") || answer.equals("n")) {
            System.out.println("The total cost of the meal is: $"+price);
            
        }
        else {
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
        }
        
    }
}