package basics;

public class TestReverseNumber {

	public static void main(String[] args) {

		int number = 154;
		int rem = 0;
		int reverse = 0;
		int n = number; // n = 154

		while (n > 0) {// n = 154, n = 15, n = 1, n = 0 (false)
			rem = n % 10; // rem = 4, rem = 5, rem = 1
			reverse = (reverse * 10) + rem; // reverse = 4, reverse = 45, reverse = 451
			n = n / 10; // n = 15, n = 1, n = 0
		}

		System.out.println("Reverse Number = " + reverse);

	}

}
