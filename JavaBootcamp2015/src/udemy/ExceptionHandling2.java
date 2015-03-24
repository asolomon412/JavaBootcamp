package udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		File file = new File("text.txt");

		try (FileReader fr = new FileReader(file)){
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e1) {
			System.out.println("Unable to close file");
		}
		System.out.println("Finished");

	}

}
