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
        String var1;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        Scanner entrada = new Scanner(System.in);
        int ent1 = entrada.nextInt();
        double ent2 = entrada.nextDouble();
        String ent3 = entrada.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(ent1+i);
System.out.println("tetes");
        /* Print the sum of the double variables on a new line. */
        System.out.println(ent2+d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.println(s + ent3);
        scan.close();
    }
}

