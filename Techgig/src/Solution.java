import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int result = solution(A);
		System.out.println("result : " + result);
	}

	public static int solution(int[] A) {
		int num = 0;
		int high = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				num = 1;
				break;
			}
			if (A[i] > high)
				high = A[i];
			else
				high = high + 1;
			// num=high;
		}
	//	System.out.println(num);
		if (num != 1) {
			 //System.out.println(num+", "+high);
			for (int i = 0; i < A.length; i++) {

				if (A[i] == high - 2) {
					num = high - 1;
				}
				if (A[i] == num)
					num = 0;

			}
			if (num == 0)
				num = high + 1;
		}
		//System.out.println(num);
		return num;
	}
}
