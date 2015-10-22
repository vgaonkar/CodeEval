import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class CapitalizeWords {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String[] input;
		int ch;
		StringBuilder word;
		
		while (scanner.hasNextLine()) {
			input = scanner.nextLine().split(" ");
			for (String i: input) {
				ch = i.charAt(0);
				if (ch > 96 && ch < 123) {
					word = new StringBuilder(i);
					ch = word.charAt(0);
					ch -= 32;
					word.setCharAt(0, (char)ch);
					System.out.print(word);
				}
				else
					System.out.print(i);
				
				System.out.print(" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}