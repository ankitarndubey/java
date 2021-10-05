package in.ankita.problemsolving;

import java.util.Arrays;

public class AssignmentDay21 {

	/*
	 * Non decreasing subarray queries Problem Description
	 * 
	 * Given an array A of size N. You will be given M queries to process. Each
	 * query will be of the form B[i][0] B[i][1].
	 * 
	 * If the subarray from B[i][0] to B[i][1] is non decreasing, the output should
	 * be 1 else output should be 0.
	 * 
	 * Return an array of integers answering each query.
	 */

	public static int[] checkSubarray(int[] A, int[][] B) {
		int[] decArr = new int[A.length];
		decArr[0] = 0;
		// find all decrement points
		for (int i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1])
				decArr[i] = 1;
			else
				decArr[i] = 0;
		}

		// find prefixSum array for decrement points array
		int[] pfSum = new int[A.length];
		pfSum[0] = decArr[0];
		for (int i = 1; i < A.length; i++) {
			pfSum[i] = pfSum[i - 1] + decArr[i];
		}
		int[] ans = new int[B.length];
		for (int i = 0; i < B.length; i++) {
			int r = B[i][1];
			int l = B[i][0];

			if (pfSum[r - 1] - pfSum[l - 1] <= 0)
				ans[i] = 1;
			else
				ans[i] = 0;

		}
		return ans;
	}

	/*
	 * Circle of Monsters Problem Description
	 * 
	 * You are playing another computer game, and now you have to slay n monsters.
	 * These monsters are standing in a circle, numbered clockwise from 1 to n.
	 * Initially, the i-th monster has ai health.
	 * 
	 * You may shoot the monsters to kill them. Each shot requires exactly one
	 * bullet and decreases the health of the targeted monster by 1 (deals 1 damage
	 * to it). Furthermore, when the health of some monster i becomes 0 or less than
	 * 0, it dies and explodes, dealing bi damage to the next monster (monster i+1,
	 * if i < n, or monster 1, if i=n). If the next monster is already dead, then
	 * nothing happens. If the explosion kills the next monster, it explodes too,
	 * damaging the monster after it and possibly triggering another explosion, and
	 * so on.
	 * 
	 * You have to calculate the minimum number of bullets mod 10 9 + 7 you have to
	 * fire to kill all n monsters in the circle.
	 * 
	 * NOTE: If the minimum no. of bullets are x then you have to return x % 1e9 + 7
	 * .
	 */
	public static int findBullets(int[] A, int[] B) {
		int mod = 1000000007;
		int n = A.length;
		int currentSum = Math.max(A[0] - B[n - 1], 0);

		for (int i = 1; i < n; i++) {
			currentSum += Math.max(A[i] - B[i - 1], 0);
			currentSum = currentSum % mod;
		}

		int minBullets = (int) Double.POSITIVE_INFINITY;
		minBullets = Math.min((currentSum - Math.max(A[0] - B[n - 1], 0)) + A[0], minBullets);

		for (int i = 1; i < n; i++) {
			minBullets = Math.min((currentSum - Math.max(A[i] - B[i - 1], 0)) + A[i], minBullets);
		}

		return minBullets % mod;
	}

	/*
	 * When will the ants die Problem Description
	 * 
	 * We have a wooden plank of the length A units. Some ants are walking on the
	 * plank, each ant moves with speed 1 unit per second. Some of the ants move to
	 * the left, the other move to the right. When two ants moving in two different
	 * directions meet at some point, they change their directions and continue
	 * moving again. Assume changing directions doesn't take any additional time.
	 * 
	 * When an ant reaches one end of the plank at a time t, it falls out of the
	 * plank imediately.
	 * 
	 * Given an integer A and two integer arrays B signifying left going ants and C
	 * signifying right going ants, the positions of the ants moving to the left and
	 * the right. Return the moment when the last ant(s) fall out of the plank.
	 */
	public static int getTimeOfAnt(int A, int[] B, int[] C) {

		int maxB = Integer.MIN_VALUE;
		int minC = Integer.MAX_VALUE;

		for (int i = 0; i < B.length; i++) {
			if (B[i] > maxB)
				maxB = B[i];
		}

		for (int i = 0; i < C.length; i++) {
			if (C[i] < minC)
				minC = C[i];
		}
		System.out.println(maxB + " " + minC);
		return Math.max(A - minC, maxB - 0);
		/*
		 * Complete solution int ans=0; for(int i=0;i<B.length;i++){
		 * ans=Math.max(ans,B[i]); } for(int i=0;i<C.length;i++){
		 * ans=Math.max(ans,A-C[i]); } return ans;
		 */
	}

	public static void main(String[] args) {
		// int[] A = { 7, 7, 1, 6, 9 };
		// int[][] B = { { 1, 3 }, { 4, 5 }, { 1, 2 }, { 3, 4 }, { 1, 5 } };
		// System.out.println(Arrays.toString(checkSubarray(A, B)));
		int[] A = { 7, 2, 5 };
		int[] B = { 15, 14, 3 };
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));

		System.out.println(findBullets(A, B));

		// int A = 4;
		// int[] B = { 4, 3 };//left
		// int[] C = { 0,1 };//right
		// System.out.println(getTimeOfAnt(A, B, C));

	}

}
