package basics;

public class TestPrimeNo2 {
	
	public static void main(String[] args) {
		
		int number = 117;
		int count = 0;
		
		
		for (int i = 2; i <= number/2; i++) {
			if (number%i == 0) {
			 count++;
				
			} 
		}
		
		if (count == 0) {
			System.out.println("its a prime no");
		}else {
			System.out.println("its not a prime no");
		}
		
		
	}

}
