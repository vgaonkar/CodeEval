import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class CalculateDistance {
	public static void main (String [] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		int x, y;
		
		while (scanner.hasNext()) {
			System.out.print(scanner.next());
			x = scanner.nextInt();
			y = scanner.nextInt();
			x -= scanner.nextInt();
			y -= scanner.nextInt();
			System.out.println(Math.sqrt(x*x + y*y));
		}
		scanner.close();
	}
}