package gc.gameevocablist.test;

import static org.junit.Assert.assertNull;
import gc.gameevocablist.WriteFile;

import java.io.FileWriter;

import org.junit.Test;

public class WriteFileTest {
	private WriteFile write = null;
	
	@Test
	public void writeToFileTestNotNull() throws Exception {
		String fileName = null;
		FileWriter scrappedFile = new FileWriter(fileName);
		assertNull(scrappedFile);
	}

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }

}
