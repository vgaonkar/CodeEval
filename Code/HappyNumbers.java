import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class HappyNumbers {
	
	private static int sumOfSquares(int number) {
		int sumOfSquares = 0;
		while (number > 0) {
			sumOfSquares += (number % 10) * (number % 10); // square the last digit
			number /= 10; 																// get rid of the last digit
		}
		return sumOfSquares;
	}
	
	private static boolean isHappyNumber(int input) {
		Map<Integer, Boolean> sumOfSquaresMap = new HashMap<Integer, Boolean>();
		switch (input) {
			case 0:
				return false;
				
			case 1:
				return true;
				
			default:
				int squareOfDigits = input;
				while ((squareOfDigits = sumOfSquares(squareOfDigits)) != 1){
					if (sumOfSquaresMap.containsKey(squareOfDigits)) {
						return false;
					}
					else {
						sumOfSquaresMap.put(squareOfDigits, true);
					}
				}
				return true;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		while (scanner.hasNextInt()) {
			int input = scanner.nextInt();
			int output = 0;
			if (isHappyNumber(input)) {
				output = 1;
			}
			System.out.println(output);
		}
		scanner.close();
	}
}