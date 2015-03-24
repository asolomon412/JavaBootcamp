public class EvenNumberGenerator {

	public void generateEvenNumbers(String[] args) throws MyException {

		try {
		int input = Integer.parseInt(args[0]);
		for (int i = 0; i < input; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number:" + i);
			}

		}
		} catch(NumberFormatException ex) {
			System.out.println("Please input a number and not an alphabet: ");
			throw new MyException();
		} catch(RuntimeException e) {
			System.out.println("Runtime Error Occurred ");
		} catch(Exception ex) {
			System.out.println("Something terrible happened ");
		}

	}

}
