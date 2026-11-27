package basics;
import java.util.Random;


public class TestRandomNumber {

	

	public static void main(String[] args){
	   
	        Random rand = new Random();
	        // nextInt(100) generates 0 to 99; adding 1 shifts it to 1 to 100
	       for (int i = 1; i <= 5; i++) {
	        int randomNum = rand.nextInt(100) + 1; 
	        
	        System.out.println(randomNum);
	    }
	}
	
}
