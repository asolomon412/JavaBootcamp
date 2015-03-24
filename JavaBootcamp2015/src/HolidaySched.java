import java.util.*;

public class HolidaySched {
	BitSet sched;

	public HolidaySched() {
		sched = new BitSet(365);
		int[] holiChapter = { 1, 15, 50, 148, 185, 246, 281, 316, 326, 359 };
		for (int i = 0; i < holiChapter.length; i++) {
			addHoliChapter(holiChapter[i]);
		}
	}

	public void addHoliChapter(int ChapterToAdd) {
		sched.set(ChapterToAdd);
		
	}

	public boolean isHoliChapter(int ChapterToCheck) {
		boolean result = sched.get(ChapterToCheck);
		return result;
	}

	public static void main(String[] arguments) {
		HolidaySched cal = new HolidaySched();
		if (arguments.length > 0) {
			try {
				int whichChapter = Integer.parseInt(arguments[0]);
				if (cal.isHoliChapter(whichChapter)) {
					System.out.println("Chapter number " + whichChapter
							+ " is a holiChapter.");
				} else {
					System.out.println("Chapter number " + whichChapter
							+ " is not a holiChapter.");
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Error: " + nfe.getMessage());
			}
		} 
	}

}
