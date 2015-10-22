//Given an array of integers A of size N > 1, produce an output array B of size N with B[i] = A[1]*A[2]…*A[i - 1]*A[i + 1]…*A[N], that is multiplies all elements in A except A[i] itself.
//Example
//Input:   3,  4,  5,  2, 
//Output: 40, 30, 24, 60 

class Continuuity2 {
	public static void main (String[] args) {
		int [] A    = { 3, 4, 5, 2 };
		int [] B	= new int[A.length];
		int []left  = new int[A.length];
		int []right = new int[A.length];
		
		left[0] = 1;
		
		for (int i = 1; i < A.length; i++) {
			left[i] = left[i-1] * A[i-1];
		}
		
		int N = A.length - 1;
		right[N] = 1;
		
		for (int i = N - 1 ; i >=  0; i--) {
			right[i] = right[i+1] * A[i+1];
		}
		
		for (int i = 0; i < A.length; i++) {
			B[i] = left[i] * right[i];
		}
		
		for (int i : B)
			System.out.println(i);
	}
}