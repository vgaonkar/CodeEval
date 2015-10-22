import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class WordToDigit {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String [] input;
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		
		numbers.put("zero",  0);
		numbers.put("one",   1);
		numbers.put("two",   2);
		numbers.put("three", 3);
		numbers.put("four",  4);
		numbers.put("five",  5);
		numbers.put("six",   6);
		numbers.put("seven", 7);
		numbers.put("eight", 8);
		numbers.put("nine",  9);

		while (scanner.hasNextLine()) {
			input = scanner.nextLine().split(";");
			for (String i : input) {
				System.out.print(numbers.get(i));
			}
			System.out.println();
		}
		scanner.close();
	}
}