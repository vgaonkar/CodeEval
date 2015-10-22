import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ReverseWords {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String[] input;
		StringBuilder output = new StringBuilder();
		
		while (scanner.hasNextLine()) {
			input = scanner.nextLine().split(" ");
			output.setLength(0);
			
			if (input.length > 0) {
				output.append(input[input.length - 1]);
				for (int i = input.length - 2; i >= 0; i--) {
					output.append(" " + input[i]);
				}
			}
			System.out.println(output);
		}
		scanner.close();
	}
}