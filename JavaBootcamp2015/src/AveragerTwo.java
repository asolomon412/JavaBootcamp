class AveragerTwo {
	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int min = 0;
		
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[0]);
		

			if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(args[i]);
				if (min > Integer.parseInt(args[i]));
					max = Integer.parseInt(args[i]);
							}
			System.out.println("Sum id: " + sum);
			System.out.println("Average is: " + (float)sum / args.length);
			System.out.println("Max: " + max);
			System.out.println("Min: " + min);
		}

	}
}

	