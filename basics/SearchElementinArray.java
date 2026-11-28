package basics;

public class SearchElementinArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 50, 30 };

		int number = 70;

		for (int i = 0; i < a.length; i++) {

			if (number == a[i]) {

				System.out.println("Found");

			}else {
				System.out.println("notfound");
			}
		}
	}
}

