import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class SwapCase {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String input;
		
		while (scanner.hasNextLine()) {
			input = scanner.nextLine();
			
			for (int i = 0; i < input.length(); i++) {
				int ch = input.charAt(i);
				if (ch > 64 && ch < 91) {
					ch += 32;
					System.out.print((char) ch);
				}
				else if (ch > 96 && ch < 123) {
					ch -= 32;
					System.out.print((char) ch);
				}
				else
					System.out.print((char) ch);
			}
			System.out.println();
		}
		scanner.close();
	}
}