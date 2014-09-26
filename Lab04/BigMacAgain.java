// Big Mac Again
// Tyler DeJarnett

import java.util.Scanner;
public class BigMacAgain {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in );
         System.out.print("Enter number of big macs: ");
        int nBigMacs = myScanner.nextInt();
        double price = nBigMacs*2.22;
        
        if (nBigMacs==1||nBigMacs==2||nBigMacs==3||nBigMacs==4||nBigMacs==5) {
            //int nBigMacs = myScanner.nextInt();
            //price = nBigMacs*2.22;
            System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of $"+ price);
            //ask for fries 
            System.out.println("Do you want an order of fries (Y/y/N/n)?");
    
            String answer = myScanner.next();
            if (answer.equals("Y") || answer.equals("y")) {
                System.out.println("You ordered fries at a cost of $2.15");
                double total = price + 2.15;
                System.out.println("The total cost of the meal is: $"+total);
            }
            else if (answer.equals("N") || answer.equals("n")) {
                System.out.println("The total cost of the meal is: $"+price);
            
            }
            else {
                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
        }
        }
        
        else if (nBigMacs < 0) {
            System.out.println("you entered a number less than zero");
        }
        
        else {
            System.out.println("you did not enter an integer");
            return;
        }
        
        
    }
}