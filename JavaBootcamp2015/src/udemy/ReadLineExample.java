package udemy;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ReadLineExample {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\Users\\launchlg\\Desktop\\JavaText.txt";

		File textFile = new File(fileName);

		Scanner scans = new Scanner(textFile);
		while(scans.hasNextLine()) {
			String line = scans.nextLine();
			System.out.println(line);
		}
		
		scans.close();
	}
}
