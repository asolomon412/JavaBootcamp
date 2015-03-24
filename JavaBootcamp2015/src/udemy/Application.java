
package udemy;

public class Application {

	public static void main(String[] args) {
		int myRange = 0;

		while (myRange < 10) {
			System.out.println("My range is: " + myRange);
			
			myRange = (myRange + 2);
		
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello, my Range is: " + myRange);
			}
		}
	}

}
