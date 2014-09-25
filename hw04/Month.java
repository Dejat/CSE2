//Tyler DeJarnett
//Month Java

import java.util.Scanner;
public class Month {
    public static void main(String[] args ) {
        //Scanner.myScanner;
        Scanner myScanner=new Scanner(System.in );
        System.out.print("Enter an int giving the number of the month (1-12): ");
        int month = myScanner.nextInt();
        
        if (month==4||month==6||month==9||month==11){
            System.out.println("The month has 30 days");
        }
        
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            System.out.println("The month has 31 days");
        }
        
        if (month==2) {
            System.out.println("Enter an int giving the year: ");
            int year = myScanner.nextInt();
            if (year==2000||year==2004||year==2008||year==2012||year==2016) {
                System.out.println("The month has 29 days");
            }
            else {
                System.out.println("The month has 28 days");
            }
        }
        else{
            System.out.println("You did not enter an int between 1 and 12");
        }
    }
}