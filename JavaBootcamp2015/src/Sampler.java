class Sampler {
	public static void main(String[] arguments) {
		Sample gizmo = new Sample();
		gizmo.height = 14;
		gizmo.weight = 2;
		gizmo.depth = 30;
		
		System.out.println("Sample Info:");
		gizmo.showAttributes();
	}	
}