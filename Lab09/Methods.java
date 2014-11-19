//Tyler DeJarnett
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
  	Scanner myScanner;
		myScanner = new Scanner(System.in );
		//int a,b,c;
		System.out.println("Enter three ints: ");
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int c = myScanner.nextInt();
		System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
		System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
		System.out.println("It is ");
		ascending(a,b,c);
		System.out.print(" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  
  public static int larger(int x,int y){
  	int big;
  	if (x>y){
  		big = x;
  	}
  	if (x<y){
  		big = y;
  	}
  	else{
  		big = x;
  	}
  	return big;
  }
  
 public static void ascending(int x,int y,int z){
 	if (x>y && y>z){
 		System.out.print(z+" "+y+" "+x);}
 	if (x>z && z>y){
 		System.out.print(y+" "+z+" "+x);}
 	if (y>x && x>z){
 		System.out.print(z+" "+x+" "+y);}
 	if (y>z && z>x){
 		System.out.print(x+" "+z+" "+y);}
 	if (z>x && x>y){
 		System.out.print(y+" "+x+" "+z);}
 	if (z>y && y>x){
 		System.out.print(x+" "+y+" "+z);}
 //	else {
 	//	System.out.print();}
 	}
 
 	}

  	

  

