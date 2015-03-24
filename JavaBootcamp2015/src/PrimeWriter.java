import java.io.*;

public class PrimeWriter {

	public static void main(String[] args) {
		int[] primes = new int[400];
		int numPrimes = 0;

		int candidate = 2;
		while (numPrimes < 400) {
			if (isPrime(candidate)) {
				primes[numPrimes] = candidate;
				numPrimes++;
			}
			candidate++;
		}
		try (FileOutputStream file = new FileOutputStream(
				"/Users/James/Documents/workspace/JavaBootcamp/src/com/wordfinder/400primes2.dat");
				BufferedOutputStream buff = new BufferedOutputStream(file);
				DataOutputStream data = new DataOutputStream(buff);) {
			for (int i = 0; i < 400; i++)
				data.writeInt(primes[i]);
			data.close();

		} catch (IOException ioe) {
			System.out.println("Error -- " + ioe.toString());
		}
	}

	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0)
				return false;
		}
		return true;
	}

}
