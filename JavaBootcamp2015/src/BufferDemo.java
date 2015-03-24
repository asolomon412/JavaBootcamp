import java.io.*;

public class BufferDemo {

	public static void main(String[] args) {
		int start = 0;
		int finish = 255;
		if (args.length > 1) {
			start = Integer.parseInt(args[0]);
			finish = Integer.parseInt(args[1]);
		} else if (args.length > 0) {
			start = Integer.parseInt(args[0]);
		}
		ArgStream as = new ArgStream(start, finish);
		System.out.println("\nWriting: ");
		boolean success = as.writeStream();
		System.out.println("\nReading: ");
		boolean readSuccess = as.readStream();
	}

}

class ArgStream {
	int start = 0;
	int finish = 255;

	ArgStream(int st, int fin) {
		start = st;
		finish = fin;
	}

	boolean writeStream() {
		try (FileOutputStream file = new FileOutputStream(
				"/Users/James/Documents/workspace/JavaBootcamp/src/com/wordfinder/pic3.gif");
				BufferedOutputStream buff = new BufferedOutputStream(file)) {
			for (int out = start; out <= finish; out++) {
				buff.write(out);
				System.out.println(" " + out);
			}
			buff.close();
			return true;
		} catch (IOException ioe) {
			System.out.println("Exception: " + ioe.getMessage());
			return false;
		}
	}

	boolean readStream() {
		try (FileInputStream file = new FileInputStream(
				"/Users/James/Documents/workspace/JavaBootcamp/src/com/wordfinder/pic3.gif");
				BufferedInputStream buff = new BufferedInputStream(file)) {
			int in;
			do {
				in = buff.read();
				if (in != -1)
					System.out.println(" " + in);
			} while (in != -1);
			buff.close();
			return true;
		} catch (IOException ioe) {
			System.out.println("Exception: " + ioe.getMessage());
			return false;
		}
	}
}