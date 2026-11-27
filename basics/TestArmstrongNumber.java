package basics;

public class TestArmstrongNumber {

	public static void main(String[] args) {

		int number = 154;
		int rem = 0;
		int sum = 0;
		int n = number; // n = 153

		while (n > 0) {// n = 153, n = 15, n = 1, n = 0 (false)
			rem = n % 10; // rem = 3, rem = 5, rem = 1
			sum = sum + (rem * rem * rem); // sum = 27, sum = 152, sum = 153
			n = n / 10; // n = 15, n = 1, n = 0
		}

		if (number == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}

	}
}
