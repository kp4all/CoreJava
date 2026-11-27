package basics;
import java.util.Scanner;

public class PrintTables {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
	    int a = sc.nextInt();
	    int table = 0;
	    for (int i = 1; i <= 10; i++) {
	    	
	    	table = a * i;
	    	System.out.println(a + "*" +i+ " = " + table);
	    	
	    }
		
		
		

	}}
