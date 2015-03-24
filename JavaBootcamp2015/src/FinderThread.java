public class FinderThread {
	private int target;
	private int start;
	private int end;
	private String threadName;

	public FinderThread(int target, int start, int end) {
		this.target = target;
		this.start = start;
		this.end = end;
		this.threadName = threadName;
		this.start();
	}

	public void start() {
		for (int i = start; i <= end; i++) {
			if (target == i) {
				System.out.println("Target number " + target
						+ " found by Thread-" + threadName);
				break;
			}

		}
	}

}