package basics;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int high = arr.length - 1;
		int low = 0;
		
		System.out.println("Enter a number to find: ");
		int search = sc.nextInt();
		

		while (low <= high) {

			int mid = low + high / 2;

			if (arr[mid] == search) {
				System.out.println("Element found at index: " + mid);
				break;
			} else if (search > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

	}

}
