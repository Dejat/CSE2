//Tyler DeJarnett
// Income Tax

import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args ) {
        //Scanner.myScanner;
        Scanner myScanner=new Scanner(System.in );
        System.out.print("Enter an int giving the number of thousands");
        int income = myScanner.nextInt();
        
        if (income <20) {
            System.out.println("The tax rate on $"+ income +",000 is 5.0%, and the tax is $"+(income*.05*1000));
        }
        
        if (income >=20 && income <40) {
            System.out.println("The tax rate on $"+ income +",000 is 7.0%, and the tax is $"+(income*.07*1000));
        }
        
        if (income >= 40 && income<78) {
            System.out.println("The tax rate on $"+ income +",000 is 12.0%, and the tax is $"+(income*.12*1000));
        }
        
        if (income >= 78) {
            System.out.println("The tax rate on $"+ income +",000 is 14.0%, and the tax is $"+(income*.14*1000));
        }
        
        if (income <=0) {
            System.out.println("You did not enter a positive int");
        }
        
        else {
            System.out.println("You did not enter an int");
        }
    }
}