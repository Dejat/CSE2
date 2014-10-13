//Tyler DeJarnett

import java.util.Scanner;
public class Roulette {
    public static void main(String[] args) {
         Scanner myScanner;
        myScanner=new Scanner(System.in );
        System.out.print("Enter number 1-38 to bet on: ");
        int x = myScanner.nextInt();
        int i = 0;
        int correct = 0;
        int wrong=0;
        while(i<100000) {
            int rand = (int )(Math.random() * 38 + 1);
            if (rand==x) {
                correct+=1;
                i+=1;
                //break;
            }
            else {
                wrong +=1;
                i+=1;
                //break;
            }
            }
        System.out.println("You got "+correct+" correct and "+wrong+" wrong");
        
        }
}