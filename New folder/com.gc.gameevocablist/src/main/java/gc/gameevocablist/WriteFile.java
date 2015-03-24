package gc.gameevocablist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {

		// public static void writeToFile() {
		String fileName = URLReader.getUrl();
		

		try (BufferedWriter br = new BufferedWriter(
				new FileWriter(fileName))) {
			br.write(fileName.toString());
		} catch (IOException e) {
			System.out.println("Unable to open file: "
					+ fileName.toString());
		}
	}
}
