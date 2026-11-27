package basics;

public class TestArmstronngno {
	
	public static void main(String[] args) {
		
		int number = 153;
		int rem = 0;
		int sum = 0;
		int n = number;
		
		while (n > 0) {
			rem = n%10; //rem = 3
			sum = sum + (rem * rem *rem);
			n = n/10;
			
		}
		System.out.println(sum);		
		
	}

}
