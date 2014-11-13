//Tyler DeJarnett
//Loop the Loop

import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args ) {
        Scanner myScanner;
        myScanner=new Scanner(System.in );
        System.out.print("Enter a number between 1 and 15: ");
        int n = myScanner.nextInt();
        int i=1;
        while(i<= n){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
                
        }
            
        }
    }

