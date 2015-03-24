public class CourseGrade {

	public static void main(String[] arguments) {
		int grade = 95;
		GradeCurve curve = new GradeCurve();
		curve.lowerGrade(grade);
		System.out.println(grade);
	}

}

class GradeCurve {
	public void lowerGrade(int g) {

		g -= 5;
	}
}