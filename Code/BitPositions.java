import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class BitPositions {
    public static boolean CompareBitPositions(int number, int position1, int position2) {
        int temp = number;
        // positions are 1 based. 
        int bit1 = (temp >> position1-1) & 1;
        int bit2 = (number >> position2-1) & 1;
        return (bit1 == bit2);
    }
        
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(new File(args[0]));
        scanner.useDelimiter(",|\\n");
        int number, position1, position2;
        while (scanner.hasNext()) {
            number    = Integer.parseInt(scanner.next());
            position1 = Integer.parseInt(scanner.next());
            position2 = Integer.parseInt(scanner.next());       
            System.out.println(CompareBitPositions(number, position1, position2));
        }
        scanner.close();
    }
}