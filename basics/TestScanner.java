package basics;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		
	int a = 0;
	int b = 1;
	
	while (b <= 100) {
		
		
		int sum = a + b;
		a = b;
		b = sum;
		
		System.out.println(sum);
		
		
		
	}
	
	

 }
}
