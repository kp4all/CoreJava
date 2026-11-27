package basics;

public class CountPrimeNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			int j = 2;

			while (j <= i / 2) {

				if (i % j != 0) {

					System.out.println(i);

				} 
				j++;

			}
		}

	}

}
