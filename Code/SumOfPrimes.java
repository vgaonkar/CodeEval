class SumOfPrimes {
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		int sum = 0;
		int count = 0;
		int number = 2;
		
		while (count < 1000) {
			if (isPrime(number)) {
				sum += number;
				count++;
			}
			number++;
		}
		
		System.out.println(sum);
	}
}