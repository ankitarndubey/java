package in.ankita.maths.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentDay16 {
	
	//check Plaindrome
	 public static String isPalindrome(int A) {
		 int sum=0;
		 int r;
		 int tmp=A;
		 while(A>0) {
			 r=A%10;
			 sum=(sum*10)+r;
			 A=A/10;
		 }
		 if(tmp==sum)
			return "True";
		 else
			 return "False";
		 
}
	 //Excel Column Number
	 public static int titleToNumber(String A) {
		 int ans=0;
		 for(int i =0;i<A.length();i++) {
			 ans=26*ans+A.charAt(i)-'A'+1;
		 }
		 return ans;
	    }
	 
	 //Rearrange Array
	 public static void arrange(ArrayList<Integer> a) {
		 int n=a.size();
		 for(int i =0;i<n;i++) {
			 a.set(i, a.get(i)*n);
			 
		 }
		 System.out.println(a);
		 for(int i =0;i<n;i++) {
			 a.set(i,a.get(i)+a.get(a.get(i)/n)/n);
		 }
		 System.out.println(a);
		 
		 for(int i =0;i<n;i++) {
			 a.set(i, a.get(i)%n);
		 }
		 System.out.println(a);
		}

	 //complete solution
	 public void arrangeSol(ArrayList<Integer> A) {
	   	    int n = A.size();
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
	}


	public static void main(String[] args) {
		//int A=121;
		//System.out.println(isPalindrome(A));
		//String A="ABCD";
		//System.out.println(titleToNumber(A));
		ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(4, 0, 2, 1, 3));
		arrange(A);

	}

}
