import java.io.IOException;
import java.io.File;
import java.util.Scanner;

class SumOfIntegersFile {
	public static void main (String [] args) throws IOException{
		Scanner scanner = new Scanner(new File(args[0]));
		int sum = 0;
		while (scanner.hasNextInt()) {
			sum += scanner.nextInt();
		}
		scanner.close();
		System.out.println(sum);
	}
}