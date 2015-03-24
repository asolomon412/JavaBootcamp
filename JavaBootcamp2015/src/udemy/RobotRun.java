package udemy;

public class RobotRun {

	public static void main(String[] args) {
		Robot tony = new Robot();
		robotMoves(tony);
	}

	private static void robotMoves(Robot tony) {
		tony.speak("Hi, my name is Tony!");
		tony.jump(7);
		tony.distance("West", 13.00);
	}

}
