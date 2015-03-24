package udemy;

public class FizzBuzzDoNotUse {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		for (int k = 1; k <= 100; k++) {
			if (k % 15 == 0) {
				sb.append("FizzBuzz\n");
			} else if (k % 3 == 0) {
				sb.append("Fizz\n");
			} else if (k % 5 == 0) {
				sb.append("Buzz\n");
			} else {
				sb.append(k);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());

		/*
		 * Write a program that prints the numbers from 1 to 100.
		 * 
		 * But for multiples of three print "Fizz" instead of the number and for
		 * 
		 * the multiples of five print "Buzz". For numbers which are multiples
		 * of both
		 * 
		 * three and five print "FizzBuzz"
		 */

	}

}
