package basics;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		int[] A = new int[n];
		int[] B = new int[n - 1];

		for (int i = 0; i < A.length; i++) {

			System.out.println("Enter value for index " + i + "of array" + "A");
			A[i] = sc.nextInt();

			
		}
		

		for (int i = 0; i < B.length; i++) {

			System.out.println("Enter value for index " + i + "of array" + "B");
			B[i] = sc.nextInt();

			
		}

		for (int j : A) {
			System.out.print(j);
		}
		
		System.out.println();
		
		for (int p : B) {
			System.out.print(p);
		}
		
		
		System.out.println(); 
		for (int k = 0; k < n; k++) {
			boolean found = false;

			for (int j = 0; j < B.length; j++) {
				if (A[k] == B[j]) {
					found = true;
					break; 
				}
			}

			
			if (!found) {
				System.out.println("Missing element: " + A[k]);
				break; 
			}
		}

		
		
	}
}
