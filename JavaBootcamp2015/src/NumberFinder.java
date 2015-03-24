public class NumberFinder {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 1000);
		System.out.println("The number is " + random);

		new FinderThread(random, 0, 249);
		new FinderThread(random, 250, 499);
		new FinderThread(random, 500, 749);
		new FinderThread(random, 750, 999);

	}

}
