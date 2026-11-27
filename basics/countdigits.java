package basics;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args) {
		
	       int number = 12345;
	       int rem = 0;
	       int sumofOdd = 0;
	       int sumofEven = 0;
	       
	       while (number > 0) {
	    	   
	    	   rem = number%10;
	    	   
	    	   if (rem%2 == 0) {
	    		   sumofEven = sumofEven + rem;
	    	   } else {
	    		   sumofOdd = sumofOdd + rem;
	    	   }
	    	   number = number/10;
	       }
	       System.out.println("Sum of Odds = "+sumofOdd);
	       System.out.println("Sum of Even = "+sumofEven);
	       
		}
}


