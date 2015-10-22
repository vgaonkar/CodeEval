// Prints the largest prime palindrome less than 1000

class PrimePalindrome {
	private static boolean IsPalindrome(int original) {
		int number = original;
		int reverse = 0;
		while (number > 0) {
			int digit  = number % 10;
			reverse 	 = reverse * 10 + digit;
			number 	 	 = number / 10;
		}
		return (original == reverse);
	}
	
	private static boolean IsPrime(int number) {
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int upperLimit = 1000;
		for (int i = upperLimit; i > 1; i--) {
			if (IsPrime(i) && IsPalindrome(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}