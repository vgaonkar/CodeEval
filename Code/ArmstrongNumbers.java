import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ArmstrongNumbers {
	
	private static int armstrong (int number) {
		int length = (int) Math.log10(number) + 1;
		int sum = 0;
		
		while (number > 0) {
			sum += Math.pow(number % 10, length);
			number /= 10;
		}
		return sum;
	}
	
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(new File(args[0]));
		int number;
		
		while (scanner.hasNextInt()) {
			number = scanner.nextInt();
			if (number == armstrong(number))
				System.out.println("True");
			else
				System.out.println("False");
		}
		scanner.close();
	}
}