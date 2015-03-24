import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Euler1PracticeTest {
	Integer expected;
	Integer actual;

	@Test
	public void testNegativeNumber() {

		actual = Euler1Practice.multiplesOf3And5(-10);
		expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testZero() {

		actual = Euler1Practice.multiplesOf3And5(0);
		expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testOneThroughNine() {

		actual = Euler1Practice.multiplesOf3And5(10);
		expected = 23;
		assertEquals(expected, actual);
	}

	@Test
	public void testOneThrough99() {

		actual = Euler1Practice.multiplesOf3And5(100);
		expected = 2318;
		assertEquals(expected, actual);
	}

	@Test
	public void testOneThrough499() {

		actual = Euler1Practice.multiplesOf3And5(500);
		expected = 57918;
		assertEquals(expected, actual);
	}

}
