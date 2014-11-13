//Tyler DeJarnett
// More Loops on Java

import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        int n=0;

  //  System.out.print("Enter an int- ");
  //  while(!scan.hasNextInt()){
  //  	scan.next(); //get rid of the junk entered by user
  //  	System.out.print("You did not enter an int; try again- ");
  //  }
    
        do{
            scan.next();
            System.out.print("You did not enter an int; try again- ");
        }
        while(!scan.hasNextInt());
   
        
        
        
     n=scan.nextInt();
    
        for(int j=0;j<n && j<40;j++){
        	for(int k=0;k<j+1;k++){
       	 System.out.print('*');
        	}
        	System.out.println();
        }