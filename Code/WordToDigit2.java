import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class WordToDigit2 {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String [] input;
		
		while (scanner.hasNextLine()) {
			input = scanner.nextLine().split(";");
			for (String i : input) {
				switch (i) {
				case "zero":
					System.out.print("0"); break;
				case "one":
					System.out.print("1"); break;
				case "two":
					System.out.print("2"); break;
				case "three":
					System.out.print("3"); break;
				case "four":
					System.out.print("4"); break;
				case "five":
					System.out.print("5"); break;
				case "six":
					System.out.print("6"); break;
				case "seven":
					System.out.print("7"); break;
				case "eight":
					System.out.print("8"); break;
				case "nine":
					System.out.print("9"); break;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}