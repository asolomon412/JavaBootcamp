import java.io.*;
public class SourceReader {

	public static void main(String[] args) {
		try (
				FileReader file = new FileReader("C:\\Users\\launchlg\\Desktop\\eclipse\\workspace_1\\JavaBootcamp2015\\src\\SourceReader.java");
				BufferedReader buff = new BufferedReader(file)) {
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				if (line == null) {
					eof = true;
				} else {
					System.out.println(line);
				}
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}

	}

}
