package in.ankita;

import java.util.ArrayList;
import java.util.Arrays;

public class PonnyDonnyMobile {
	public ArrayList<Integer> solve() {

		//B.sort(null);
		int[] A =  new int[] {23, 36, 58, 59 };
		int[] B =	new int[] {3, 207, 62, 654, 939, 680, 760};
		ArrayList<Integer> result = new ArrayList<Integer>();
		int ans = 0;
		int bal = 0;
		for (int i =0;i<B.length;i++) {// B : [ 3, 207, 62, 654, 939, 680, 760 ]
			for (int j=0;j<A.length;j++) {// A : [ 23, 36, 58, 59 ]
				
				if (bal + A[j] <= B[i]) {
					bal = bal + A[j];
					// Increment count
					ans++;
				}

			}
			result.add(ans);
			ans = 0;
			bal=0;
		}
		return result;
	}
}
