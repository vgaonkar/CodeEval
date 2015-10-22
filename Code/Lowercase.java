import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Lowercase {
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(new File(args[0]));
		String line;
		
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			System.out.println(line.toLowerCase());
		}
		scanner.close();
	}
}