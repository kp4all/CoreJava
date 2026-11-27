package basics;
public class TestPalindrome2 {
	
	public static void main(String[] args) {
		
		int number = 121;
		int rem = 0;
		int reverse = 0;
		int n = number;
		
		while (n > 0) {
			rem = n%10; // rem = 1 // rem = 2 // 
			reverse = (reverse * 10) + rem; // reverse = 1 // reverse = 12
			n = n/10; //n = 12 // n = 1
		}
		
		if (reverse == number) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Reverse Number" + reverse);
		}
		
	}

}
