import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class SumOfDigits {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		int number, sum;

		while (scanner.hasNextInt()) {
			number = scanner.nextInt();
			sum = 0;
			while (number > 0) {
				sum += number % 10;
				number /= 10;
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}