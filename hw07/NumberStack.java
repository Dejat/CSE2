//Tyler DeJarnett

import java.util.Scanner;
public class NumberStack {
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
        int num = myScanner.nextInt();
        //i = 0;
        System.out.println("Using a For Loop");
        for (int x =1;x<num+1;x=x+1){
            //System.out.println("   "+x);
            switch (x){
                case 1:
                    System.out.print(x);
                    break;
                case 2:
                    System.out.print(x+""+x+""+x);
                    break;
                case 3:
                    System.out.print(x+""+x+""+x+""+x+""+x);
                    break;
                case 4:
                    System.out.print(x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 5:
                    System.out.print(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 6:
                    System.out.print(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 7:
                    System.out.print(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 8:
                    System.out.print(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                default:
                    System.out.println("You did not enter a number between 1 and 9");
                    
            }
            System.out.println("\n");
            System.out.println("----");
            
        }
        
        System.out.println("Using While Loops");
        int x = 1;
        while(x<num+1){
            switch (x){
                case 1:
                    System.out.println(x);
                    break;
                case 2:
                    System.out.println(x+""+x+""+x);
                    break;
                case 3:
                    System.out.println(x+""+x+""+x+""+x+""+x);
                    break;
                case 4:
                    System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 5:
                    System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 6:
                    System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 7:
                    System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                case 8:
                    System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
                    break;
                default:
                    System.out.println("You did not enter a number between 1 and 9");
                    
            }
            System.out.print("\n");
            x=x+1;
            
        }
    System.out.println("Using Do-While Loop");
    int i=1;
    do{
        switch (i){
            case 1:
                System.out.println(i);
                break;
            case 2:
                System.out.println(i+""+i+""+i);
                break;
            case 3:
                System.out.println(i+""+i+""+i+""+i+""+i);
                break;
            case 4:
                System.out.println(i+""+i+""+i+""+i+""+i+""+i+""+i);
                break;
            case 5:
                System.out.println(i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i);
                break;
            case 6:
                System.out.println(i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i);
                break;
            case 7:
                System.out.println(i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i);
                break;
            case 8:
                System.out.println(i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i);
                break;
            default:
                System.out.println("You did not enter a number between 1 and 9");
        }
        i=i+1;
    }while(i<num+1);
        
    }
        
    }
