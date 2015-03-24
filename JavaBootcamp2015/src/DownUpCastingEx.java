public class DownUpCastingEx {

	public static void main(String[] args) {
		Gadget gad1 = new Gadget();
		Camera camera1 = new Camera();
		Photographer photographer1 = new Photographer();

		camera1.start();
		gad1.start();
		camera1.snap();

		// Upcasting Example
		Gadget gad2 = camera1;
		gad2.start();

		photographer1.name();
		photographer1.snap();

		// Downcasting example
		Gadget gad3 = new Camera();
		Camera camera2 = (Camera) gad3;
		camera2.snap();
	}

}
