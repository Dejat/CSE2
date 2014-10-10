//Tyler DeJarnett  
//Random Games Java

import java.util.Scanner;
public class RandomGames {
    public static void main(String[] args ) {
        Scanner myScanner=new Scanner(System.in );
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        //Scanner reader = new Scanner(System.in);
        String option = myScanner.next();
        int number = (int)(Math.random()*36+1);

        switch(option) {
            case "R":
                System.out.println("Roulette: "+ number);
                break;
            case "r":
                System.out.println("Roulette: " + number);
                break;
            case "P":
                System.out.println("Picking a card not implemented yet");
                break;
            case "p":
                System.out.println("Picking a card not implemented yet");
                break;
            case "C":
                System.out.println("Craps option is yet to be implemented");
                break;
            case "c":
                System.out.println("Craps option is yet to be implemented");
            
            default:
                System.out.println("wrong");
                
            
            
            
        }
      
        
        
            
        }
    
}
