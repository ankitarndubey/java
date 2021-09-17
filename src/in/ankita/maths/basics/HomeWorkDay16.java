package in.ankita.maths.basics;

public class HomeWorkDay16 {

	// Number to title
	public static String convertToTitle(int A) {
		// To store result (Excel column name)
		StringBuilder columnName = new StringBuilder();

		while (A > 0) {
			int rem = A % 26;
			if (rem == 0) {
				columnName.append("Z");
				A = (A / 26) - 1;
			} else {
				columnName.append((char) ((rem - 1) + 'A'));
				A = A / 26;
			}
		}
		System.out.println(columnName);
		return columnName.reverse().toString();
	}

	// Reverse integer
	public static long reverseInt(int A) {
		long reverse = 0;
		while (A != 0) {
			int rem = A % 10;
			reverse = reverse * 10 + rem;
			A = A / 10;
			System.out.println(rem + " " + reverse + " " + A);
		}
		if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
			return 0;
		return reverse;
	}

	// Grid unique paths
	// Exponential TC
	public static int uniquePaths(int A, int B) {

		// Return 1 if it is the first
		// row or first column
		if (A == 1 || B == 1)
			return 1;

		// Recursively find the no of
		// way to reach the last cell.
		return uniquePaths(A - 1, B) + uniquePaths(A, B - 1);
	}

	// Grid unique path TC o(n)
	public static int gridUniquePaths(int A, int B) {
		if(A==1 || B==1)
			return 1;
		int n =(A-1)+(B-1);
		int r =A-1;
		if(B>A) {
			r=(B-1);
		}
		
		return (int)nCr(n, r);
		
	}

	//nCr
	static double nCr(int n, int r) {
	double f=1;
	double p=2;
	for(int i =n;i>r;i--) {
		f*=i;
		if(p<=(n-r)) {
			f/=p;
			p++;
		}
	}
	return f;
	}
	//find factorial
	static int factorial(int n) {
		System.out.println(n);
		int result = 1, i;
		for(i=2;i<=n;i++ ) {
			result=(result*i);
		}
		System.out.println("factorial : "+result);
		return result;
	}
/*
 * Sorted Permutation Rank
Problem Description

Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003
 */
	
	public static int findRank(String A) {
		int ans=0;
		return ans;
	}
	public static void main(String[] args) {
		// int A=233;
		// System.out.println(convertToTitle(A));
		// int A=-12;
		// System.out.println(reverseInt(A));
		//int A = 15, B = 9;
		//System.out.println(gridUniquePaths(A, B));
		String A="acb";
		System.out.println(findRank(A));
	}

}
