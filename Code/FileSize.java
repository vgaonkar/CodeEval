import java.io.File;

class FileSize{
	public static void main (String[] args) {
		System.out.println(new File(args[0]).length());
	}
}