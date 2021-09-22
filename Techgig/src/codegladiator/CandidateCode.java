package codegladiator;

import java.util.Scanner;
//New Year Party
public class CandidateCode {

	public static int n = (int) (1e6 + 10);
	public static Scanner sc;
	public static void main(String args[]) throws Exception {
		int n, maxSum, index;
		int[] incl = new int[CandidateCode.n], value = new int[CandidateCode.n], from_ind = new int[CandidateCode.n];
		boolean[] minus = new boolean[CandidateCode.n];
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 10) {
			while (T > 0) {
				n = sc.nextInt();
				for (int i = 1; i <= n; i++) {
					value[i] = sc.nextInt();
					if (value[i] < 0) {
						value[i] = 0;
						minus[i] = true;
					} else {
						minus[i] = false;
					}
				}
				incl[1] = value[1];
				incl[2] = value[2];
				from_ind[1] = 0;
				from_ind[2] = 0;
				maxSum = incl[1];
				index = 1;
				for (int i = 3; i <= n; i++) {
					incl[i] = value[i] + maxSum;
					from_ind[i] = index;
					if (incl[i - 1] > maxSum) {
						maxSum = incl[i - 1];
						index = i - 1;
					}
				}
				if (incl[n] > maxSum) {
					index = n;
				}
				while (index != 0) {
					if (!minus[index]) {
						System.out.print(value[index]);
					}
					index = from_ind[index];
				}
				System.out.print("\n");
				T--;
			}
		}
		sc.close();
	}
}

