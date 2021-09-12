import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to play Fizz-Buzz to...");
		
		int end = Integer.valueOf(scan.nextLine());
		
		FizzBuzz game = new FizzBuzz(end);
		
		game.play();

	}

}
