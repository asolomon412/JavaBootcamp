package udemy;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command");

		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("The machine is running!");
			break;

		case "stop":
			System.out.println("The machine is shutting down!");
			break;

		default:
			System.out.println("Command not recognized... Bummer");
			break;
		}
		input.close();
	}
}
