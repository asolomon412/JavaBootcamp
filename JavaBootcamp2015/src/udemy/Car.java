package udemy;

public class Car extends Machine {

//	public void start() {
//		System.out.println("Car started");
//	}
	
		
	public void showInfo() {
		System.out.println("Car name: " + name);
	}

	@Override
	public void start() {
		System.out.println("Car started!");
	}

}
