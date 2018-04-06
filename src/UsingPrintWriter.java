import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter outputFile = new PrintWriter("cOdden.txt");
		outputFile.println("Hello, from cOdden!");
		outputFile.close();
		// System.out.println("All done!");
	}

}
