import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class MorseCode {
	private static Map<String, String> code = new HashMap<String, String>();
	
	private static void buildMap() {
		String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
		
		for (int i = 0; i < english.length; i++) {
			code.put(morse[i], english[i]);
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(new File(args[0]));
		String[] input;
		StringBuilder output = new StringBuilder();
		buildMap();
		
		while(scanner.hasNextLine()) {
			input = scanner.nextLine().split(" ");
			output.setLength(0);
			
			for (String i: input)
				output.append(code.get(i));
			
			System.out.println(output);
		}
		scanner.close();
	}
}