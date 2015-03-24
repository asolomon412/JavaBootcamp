package udemy;

public class MachineCarRun {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();

		Car car1 = new Car();
		car1.start();
		car1.showInfo();
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);

	}

}
