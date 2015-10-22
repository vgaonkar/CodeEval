import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String [] args) throws IOException{
        Scanner scanner = new Scanner(new File(args[0]));
        int number;
        
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            
            if (((number % 10) % 2) == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
        scanner.close();
    }
}