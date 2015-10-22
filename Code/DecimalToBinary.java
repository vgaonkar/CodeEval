import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class DecimalToBinary {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		
		while(scanner.hasNextInt()) {
			System.out.println(Integer.toBinaryString(scanner.nextInt()));
		}
		scanner.close();
	}
}