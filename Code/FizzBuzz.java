import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FizzBuzz {
	private static void fizzBuzz(int firstDivider, int secondDivider, int count) {
		StringBuilder output = new StringBuilder();
		
		for (int i = 1; i <= count; i++) {
			if (i % firstDivider == 0 && i % secondDivider == 0) {
				output.append("FB");
			}
			else if (i % firstDivider == 0 && i % secondDivider != 0) {
				output.append("F");
			}
			else if (i % firstDivider != 0 && i % secondDivider == 0) {
				output.append("B");
			}
			else {
				output.append(i);
			}
			output.append(" ");
		}
		// remove trailing space
		System.out.println(output.toString().trim());
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		
		while(scanner.hasNextLine()) {
			String rawInput   = scanner.nextLine();
			String[] input    = rawInput.split("\\s+");
			int firstDivider  = Integer.parseInt(input[0]);
			int secondDivider = Integer.parseInt(input[1]);
			int count 		  = Integer.parseInt(input[2]);
			fizzBuzz(firstDivider, secondDivider, count);
		}
		scanner.close();
	}
}