package practice;

// Java program to find maximum length subsequence 
// such that adjacent elements have at least 
// one common digit 
import java.util.*; 

class GFG 
{ 

// Returns length of maximum length subsequence 
static int findSubsequence(int arr[], int n) 
{ 

	// To store length of maximum length subsequence 
	int len = 1; 

	// To store current element arr[i] 
	int tmp; 

	int i, j, d; 

	// To store length of subsequence 
	// having common digit d 
	int dp[] = new int[10]; 


	// To store digits present in current element 
	int cnt[] = new int[10]; 

	// To store local maximum for current element 
	int locMax; 

	// For first element maximum length is 1 for 
	// each digit 
	tmp = arr[0]; 
	while (tmp > 0) 
	{ 
		dp[tmp % 10] = 1; 
		tmp /= 10; 
	} 

	// Find digits of each element, then find length 
	// of subsequence for each digit and then find 
	// local maximum 
	for (i = 1; i < n; i++) 
	{ 
		tmp = arr[i]; 
		locMax = 1; 
				Arrays.fill(cnt, 0); 

		// Find digits in current element 
		while (tmp > 0) 
		{ 
			cnt[tmp % 10] = 1; 
			tmp /= 10; 
		} 
		
		for(int i1=0;i1<dp.length;i1++)
			System.out.print(dp[i1]+" ");
		System.out.println("Count");
		for(int i1=0;i1<cnt.length;i1++)
			System.out.print(cnt[i1]+" ");

		// For each digit present find length of 
		// subsequence and find local maximum 
		for (d = 0; d <= 9; d++) 
		{ 
			if (cnt[d] == 1) 
			{ 
				dp[d]++; 
				locMax = Math.max(locMax, dp[d]); 
			} 
		} 

		// Update value of dp[d] for each digit 
		// present in current element to local maximum 
		// found 
		for (d = 0; d <= 9; d++) 
		{ 
			if (cnt[d] == 1) 
			{ 
				dp[d] = locMax; 
			} 
		} 

		// Update maximum length with local maximum 
		len = Math.max(len, locMax); 
	} 

	return len; 
} 

// Driver code 
public static void main(String[] args) 
{ 
	int arr[] = { 1, 12, 44, 29, 33, 96, 89 }; 
	int n = arr.length; 
		System.out.print(findSubsequence(arr, n)); 
} 
} 

/* This code contributed by PrinciRaj1992 */
