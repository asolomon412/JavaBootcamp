package udemy;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a floating point value: ");

		double value = input.nextDouble();

		System.out.println("You entered: " + value);
	}

}
