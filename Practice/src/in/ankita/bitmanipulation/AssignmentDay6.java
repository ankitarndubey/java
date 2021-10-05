package in.ankita.bitmanipulation;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AssignmentDay6 {

	// Given an array of integers A, every element appears twice except for one.
	// Find that single one.
	public static int singleNumber(int[] a) {
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		int ans = 0;
		for (int i : A)
			ans ^= i;
		return ans;
	}

	// function that takes an xinteger and returns the number of 1 bits it has.
	public static int numSetBits(int A) {
		int ans = 0;
		// take & with 1 and right shift the number till it is 0
		while (A > 0) {
			ans += A & 1;
			A >>= 1;
		}
		return ans;
	}

	// count 1 for 1 to A, and find modulo of count 10^9+7
	public static int solve(int A) {
		// Time complexity increasing
		/*
		 * int count = 0; for (int i = 1; i <= A; i++) { int j = i; while (j > 0) {
		 * System.out.println(count + " : " + i); count += j & 1; j >>= 1; } }
		 * //count=count&(2^9) return count & 1000000007;
		 */

		// for better TL
		long count = 0;
		A=A+1;
		long mod = 1000000007;
		long k1, k2;
		for (int i = 0; i < 32; i++) {
			k1 = (long) Math.pow(2, i + 1);
			k2 = (long) Math.pow(2, i);
			System.out.println(k1 + " " + k2);
			count+=(((A/k1)*k2)%mod)+Math.max(0,(((A%k1)-k2)%mod));

			/*count =  ( count + ((A / k1) * k2) % mod);
			if ((A % k1) - k2 > 0) {
				count += (A % k1 - k2) % mod;
			}
*/
			System.out.println(count);
		}
		return (int)count;
	}

	//Add two binary string bit by bit
	static void addBinaryStrings(String A, String B) {
		String result = "";
		int carry = 0;
		int i = A.length() - 1, j = B.length() - 1;

		while (i >= 0 || j >= 0 || carry == 1) {

			int sum = 0;
			sum += ((i >= 0) ? A.charAt(i) - '0' : 0);
			sum += ((j >= 0) ? B.charAt(j) - '0' : 0);
			sum += carry;
			result = (char) (sum % 2 + '0') + result;
			carry = sum / 2;
			System.out.println("Sum - " + sum + " carry : " + carry);
			System.out.println(result);
			i--;
			j--;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {

		// int[] a = new int[] {1, 2, 2, 3, 1};
		// System.out.println(singleNumber(a));
		// System.out.println(numSetBits(11));
		 System.out.println(solve(4));
		
		 // String A = "1010110111001101101000"; String B = "1000011011000000111100110";
		
		//String A = "101";
		//String B = "100";
		//addBinaryStrings(A, B);
		/*
		 * int i =10^10; String ans=(1<<i)+""+(1<<i)+""+i; System.out.println(ans);
		 */
	}

}