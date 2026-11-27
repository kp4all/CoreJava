package basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number A");
		int a = sc.nextInt();
		System.out.println("Enter Number B");
		int b = sc.nextInt();
		System.out.println("Enter Operator:");
		String opr = sc.next();

		switch (opr) {

		case "-":
			System.out.print("Ans = "+(a - b));
			break;

		case "+":
			System.out.print("Ans = "+(a + b));
			break;

		case "*":
			System.out.print("Ans = "+(a * b));
			break;

		case "/":
			if (b != 0) {
				System.out.print((double) a / b);
			} else {
				System.out.println("Cannot Divide");
			}
			break;
		default:
			System.out.print("Invalid Input");
		}
		sc.close();
	}

}
