import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FibonacciSeries {
	
	private static int fibonacciNumbers(int number) {
		if (number == 0)
			return 0;
		
		if (number == 1 || number == 2)
			return 1;
		
		else return fibonacciNumbers(number - 1) + fibonacciNumbers(number - 2);
	}
	
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		
		while (scanner.hasNextInt()) {
			System.out.println(fibonacciNumbers(scanner.nextInt()));
		}
		scanner.close();
	}
}