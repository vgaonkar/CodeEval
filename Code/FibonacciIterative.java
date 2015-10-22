import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FibonacciIterative {
	
	private static int fibonacciNumbers(int number) {
		if (number == 0 )
			return 0;
		
		int a = 1;
		int b = 1;
		int c = 0;
		
		for (int i = 3; i <= number; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		
		while (scanner.hasNextInt()) {
			System.out.println(fibonacciNumbers(scanner.nextInt()));
		}
		scanner.close();
	}
}