package basics;

public class AverageOddEven {

	public static void main(String[] args) {
		
		int avgOdd = 0;
		int avgEven = 0;
		int n = 100;
		int odds = 0;
		int even = 0;
		int odds = 0;
		int even = 0;
		
		for (int i = 1; i <= n; i++) {
			
			if (i%2 == 0) {
				even++;
			} else {
				odds++;
			}
			
		}
		
		avgOdd = n/odds;
		avgEven = n/even;
		System.out.println(avgOdd);
		System.out.println(avgEven);
	}
	
}
