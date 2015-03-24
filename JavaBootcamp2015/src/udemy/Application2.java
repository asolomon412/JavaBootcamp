package udemy;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		String input = "1 sprite 2 sprite red sprite blue sprite";
		Scanner s = new Scanner(input).useDelimiter("\\s*sprite\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();

	}
}
