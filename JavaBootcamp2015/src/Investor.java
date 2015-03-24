public class Investor {
	public static void main(String[] arguments) {
		double inv = 14000;
		System.out.println("Our initial investment is " + inv);

		// Increase investment by 40% in year 1
		inv = inv * .4 + inv;
		System.out.println("This is the status of our investment in year 1: "
				+ inv);

		// Lose $1500 in year 2
		inv = inv - 1500;
		System.out.println("This is the status of our investment in year 2: "
				+ inv);

		// Increase by 12% in year 3
		inv = inv * .12 + inv;
		System.out.println("This is the status of our investment in year 3: "
				+ inv);

	}
}