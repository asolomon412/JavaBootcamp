package gc.gameevocablist.test;

import static org.junit.Assert.assertNotNull;
import gc.gameevocablist.URLReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;

public class URLReaderTest {
	private URLReader read = null;

	@Before
	public void initialize() {
		read = new URLReader();
	}

	@Test
	public void testFileShouldNotBeNull() throws FileNotFoundException {

		FileReader file = new FileReader("url.txt");
		assertNotNull(file);
	}

}
