package udemy;

public class Robot {
	public void speak(String text) {
		System.out.println(text);

	}



	public void jump(int height) {
		System.out.println("Jumping: " + height + " meters per second");
	}
	
	public void distance(String direction, double distance) {
		System.out.println("Going " + distance + " in this direction: " + direction);
	}
}