package basics;

public class TestArray {

	public static void main(String[] args) {
		
	int[] a = new int[5];
	a[0] = 1;
	a[1] = 2;
	a[2] = 1;
	a[3] = 1;
	a[4] = 1;
    
	System.out.println(a[1]);
	
	int[] numbers = {1,3,5,7,9,10};
	
	for (int i : numbers) {
		System.out.print(i);
	}
	
	}
}
