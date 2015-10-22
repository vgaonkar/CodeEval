import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class HexToDecimal {
	public static void main (String[] args) throws IOException{
		Scanner scanner = new Scanner(new File(args[0]));
		String hex;
		
		while (scanner.hasNext()) {
			hex = (scanner.nextLine()).trim();
			System.out.println(Integer.parseInt(hex, 16));
		}
		scanner.close();
	}
}