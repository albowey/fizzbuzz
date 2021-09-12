/*
 * 	Fizz-Buzz is a simple number game:
 * 	Count the numbers from 1, as normal; 1, 2, 3, 4, 5, 6, 7...
 * 
 * 	However, if the number is divisible by 3 (i.e. there's no remiander) then replace the number with Fizz
 * 	So, we then count: 1, 2, Fizz, 4, 5, Fizz, 7...
 * 
 * 	But, there's more...
 * 	If the number is divisible by 5, then replace the number with Buzz
 *  So, we now count: 1, 2, Fizz, 4, Buzz, Fizz, 7...
 * 
 * 	And
 *  If the number is divisible by both three and five, then replace the number with Fizz-Buzz
 *  
 *  This program will allow you to select a number to play Fizz-Buzz to
 *  There will be a sleep function between each count, which will give the impression of a real count
 *  
 */

public class FizzBuzz {
	
	private int countTo;
	
	public FizzBuzz(int value) {
		this.countTo = value;
	}
	
	public void play() {
		for (int i = 1; i <= this.countTo; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz-Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
			
			try {
			    Thread.sleep(300);
			} catch (InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	}
}