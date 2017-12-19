package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Aula_1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);        
        /* Declare second integer, double, and String variables. */
        int num1;
        double num2;
        String var1="is the best place to learn and practice coding!";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        num1 = scan.nextInt();
        //scan.nextLine();
        System.out.println(num1+i);
        
        num2 = scan.nextDouble();
       // scan.nextLine();
        System.out.println(num2+d);
        
        scan.nextLine();
        var1 = scan.nextLine();
        System.out.println(s + var1);
        
        /* Print the sum of both integer variables on a new line. */
        
        //System.out.println("tetes");
        /* Print the sum of the double variables on a new line. */
        
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        
        scan.close();
    }
}

