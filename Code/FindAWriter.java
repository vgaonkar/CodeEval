import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FindAWriter {
    public static void findWriter(char[] name, String[] positions) {        
        StringBuilder output = new StringBuilder();
        
        for(String i : positions) {
            output.append(name[Integer.parseInt(i) - 1]);
        }
        
        System.out.println(output);
    }
    
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File(args[0]));
        String[] input;
        char[] name;
        String[] positions;
        
        while (scanner.hasNext()) {
            input = scanner.nextLine().split("\\| ");
            name = input[0].toCharArray();
            positions = input[1].split(" ");
            findWriter(name, positions);
        }
        scanner.close();
    }
}