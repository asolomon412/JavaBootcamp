
public class Gadget {
	public void start() {
		System.out.println("Gadget Started!");
	}
}

class Camera extends Gadget {
	public void start() {
		System.out.println("Camera Started!");

	}

	public void snap() {
		System.out.println("Picture taken!");
	}
}

class Photographer extends Camera {
	public void name() {
		System.out.println("My name is Joe");
	}
}