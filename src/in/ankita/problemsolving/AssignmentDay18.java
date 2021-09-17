package in.ankita.problemsolving;

public class AssignmentDay18 {

	/*
	 * Pick from both sides!
Problem Description
Given an integer array A of size N.
You can pick B elements from either left or right end of the array A to get maximum sum.
Find and return this maximum possible sum.
NOTE: Suppose B = 4 and array A contains 10 elements then
You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.
	 */
	public static void pickFromSides(int[] A, int B) {
		
		int left=B-1;
		int right_end=A.length-1;
		
		int sum_left=0;
		int sum_right=0;
		int max_sum=Integer.MIN_VALUE;
		for(int i =0;i<B;i++) {
			sum_left+=A[i];
			
		}
		max_sum=sum_left+sum_right;
		while(left>-1) {
			
			
				sum_left-=A[left];
				left--;
			
			
			sum_right+=A[right_end];
			right_end--;
			max_sum=Math.max(max_sum, sum_left+sum_right);
		}
		System.out.println(max_sum);
	}
	
	public static void main(String[] args) {
		
		//int[] A = {5, -2, 3 , 1, 2};
		//int B = 3;
		//int[] A = { 1, 2};
		//int B = 1;
		int[] A = { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
		int	B = 48;
		pickFromSides(A, B);
	}

}
