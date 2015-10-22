class MultiplicationTables {
	public static void main(String[] args) {
		int multiplier = 1;
		int product = 1;
		int multiplicand;
		String tempOutput = new String(); // each line of output.
		
		while (multiplier <= 12) {
			for (multiplicand = 1; multiplicand <= 12; multiplicand++) {
				product = multiplier * multiplicand;
				tempOutput += String.format("%4s", args);
			}
			multiplier++;
		}
	}
}