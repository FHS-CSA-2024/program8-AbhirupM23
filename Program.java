
import java.util.Scanner;
import java.lang.Math.*;

class program {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter First Integer:");
        int num1=myScanner.nextInt();
        System.out.print("Enter Second Integer:");
        int num2=myScanner.nextInt();
        
        int sum=num1+num2;
        System.out.println("The sum is: "+sum);
        int diff=num1-num2;
        System.out.println("The difference is: "+diff);
        int prod=num1*num2;
        System.out.println("The product is: "+prod);
        double avg = (double)(num1+num2)/2;
        System.out.println("The average is: "+avg);
        int dist=Math.abs(num1-num2);
        System.out.println("The distance is:" + dist);
        int max=(num1+num2+Math.abs(num1-num2))/2;
        System.out.println("The Maximum is: "+max);
        int min=(num1+num2-Math.abs(num1-num2))/2;
        System.out.print("The Minimum is: "+min);
        
        
        }
  }

// Enter number 1: 13

// Enter number 2: 20

// Original numbers are 13 and 20

// Sum = 33

//Difference = -7

//Product = 260

//Average = 16.5

//Absolute value = 7

//Maximum = 20

//Minimum = 13 */
