package in.ankita.string.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmentDay15 {

	// reverse the string
	public static String simpleReverse(String A) {
		int n = A.length();
		byte[] reverse = A.getBytes();
		for (int i = 0; i < n / 2; i++) {
			byte tmp = reverse[i];
			reverse[i] = reverse[n - 1 - i];
			reverse[n - 1 - i] = tmp;
		}

		return (new String(reverse));
	}

	// Rotate string
	public static void rotateString(String A, int B) {
		int n = A.length();
		B = B % n;

		System.out.println(A.substring(n - B, n) + A.substring(0, n - B));
	}

	// Reverse string
	public static void reverseString(String A) {
		int n = A.trim().length();
		String reversed = simpleReverse(A.trim());
		int i = 0, j = 0;
		String ans = "";
		while (i < n && j < n) {
			while (j < n && reversed.charAt(j) != ' ') {
				j++;
			}
			int tmp = j;
			j--;
			ans += simpleReverse(reversed.substring(i, tmp)) + " ";
			i = tmp + 1;
			j = tmp + 1;

		}
		System.out.println(ans.trim());
	}

	// tolower()
	public static ArrayList<Character> toLower(ArrayList<Character> A) {
		
		System.out.println(A);
		for(char c:A) {
			
				if(c>='A' && c<='Z') {
					System.out.println((char)(int)c+32);
				}
			
		}
		return A;
	}

	// toUpper
	public static String toUpper(String A) {

		byte[] a = A.getBytes();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
				a[i] = (byte) ((int) A.charAt(i) - 32);
			}
		}
		return new String(a);

	}
	
	//isalpha() consisting of a character array A.
	//Return 1 if all the characters of a character array are alphanumeric 
	//(a-z, A-Z and 0-9), else return 0
	public static int isAlphaNum(char[] A) {
        
		for(int i =0;i<A.length;i++) {
			char c =A[i];
			if(!((c>='a' && c<='z')|| (c>='A'&& c<='Z') ||(c>='0' && c<='9')))
				return 0;
			
		}
		return 1;
	
    }
	
	//is alphabetical
	public static int isAlpha(char[] A) {
		for(int i =0;i<A.length;i++) {
			char c =A[i];
			if(!((c>='a' && c<='z')|| (c>='A'&& c<='Z')))
				return 0;
			
		}
		return 1;
	}

	public static void main(String[] args) {
		// String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
		// hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif
		// simpleRevervse(A);
		// String A="jadgbxjesitcdbnbkftdv";
		// rotateString(A, 29);// erscal
		// reverseString(A);
	//	ArrayList<Character> A= new ArrayList<Character>();
		//A.add('S');
		//A.add('B');
		//System.out.println(toLower(A));
		char[] A = {'S', 'c', 'a', 'l', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
		//System.out.println(isAlphaNum(A));
		System.out.println(isAlpha(A));

	}

}
