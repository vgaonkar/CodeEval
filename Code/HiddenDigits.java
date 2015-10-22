import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class HiddenDigits {
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(new File(args[0]));
        String input;
        int ch;
        StringBuilder output = new StringBuilder();
        
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            output.setLength(0);
            
            for (int i = 0; i < input.length(); i++) {
                ch = input.charAt(i);
                
                if (ch > 47 && ch < 58)
                    output.append((char) ch);
                
                else if (ch > 96 && ch < 107) {
                    ch -= 97;
                    ch += 48;
                    output.append((char) ch);
                }
            }
            if (output.length() == 0)
                System.out.println("NONE");
            else
                System.out.println(output);
        }
        scanner.close();
    }
}