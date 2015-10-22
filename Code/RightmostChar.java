import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class RightmostChar {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(args[0]));
		String[] input;
		boolean write = false;
//		int position;
		
		while (scanner.hasNextLine()) {
			input = scanner.nextLine().split(",");
//			position = input[0].lastIndexOf(input[1].charAt(0));
//			System.out.println(position);
			write = false;
			
			for (int i = input[0].length() - 1; i >= 0; i--) {
				if ((input[0]).charAt(i) == (input[1]).charAt(0)) {
					System.out.println(i);
					write = true;
					break;
				}
			}
			if (!write)
				System.out.println("-1");
		}
		scanner.close();
	}
}