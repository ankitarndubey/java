package codegladiator.semifinal;

// A Divide and Conquer based Java 
// program for maximum subarray sum 
// problem 
import java.util.*;
import java.util.Vector;

class SubarrayNoCommonDigit {
	int find_mask(int n) {
		int mask = 0;
		for (int i = 1; i < n; i *= 10) {
			int digit = n / i % 10;
			mask |= 1 << digit;
		}
		return mask;
	}

	int dp_subarray (int set, int memo_a[1 << 10], const vector [int] &a)
	{
	  if (set == 0)
	    {
	      return memo_a[set] = 0;
	    }
	  if (memo_a[set] != -1)
	    return memo_a[set];

	  int result = 0;
	for (auto num:a)
	    {
	      int bitmask = find_mask (num);
	      if ((set | bitmask) == set)
		result =Math.max (dp_subarray (set ^ find_mask (num), memo_a, a) + num,
			    result);
	    }
	  return memo_a[set] = result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int n1 = n / 1;

		      Vector <Integer>vector_a =new Vector<Integer>();
		      for (int i = 0; i < n; i++) 
		    	  vector_a.add(arr[i]);

		      int memo_a[1 << 10];
		      for (int i = 0; i < 1 << 10; i++)
		    	  memo_a[i] = -1;

		      int maxSum = 0;
		      for (int i = 0; i < 1 << 10; i++)
			{
			  maxSum = Math.max(maxSum, dp_subarray (i, memo_a, vector_a));
			}
		      System.out.print(maxSum+"\n");
		    }
		}
}
