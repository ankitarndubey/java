package in.ankita.string.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWorkDay15 {

	// Amazing Subarrays
	// Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O,
	// U).
	public static int getAmazingSubstrings(String A) {
		int n = A.length();
		int count = 0;
		HashSet<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		for (int i = 0; i < n; i++) {
			if (vowels.contains(A.charAt(i))) {
				/*
				 * int k =i; while(k<n) { count++; k++; }
				 */
				count += n - i;
			}
		}
		return count % 10003;
	}

	// Count Occurrences
	public static int countOccurrences(String A) {
		int count = 0;
		int N = A.length();

		for (int i = 0; i < N; i++) {
			char x = A.charAt(i);
			if (x == 'b' && i + 2 < N) {
				if (A.charAt(i + 1) == 'o' && A.charAt(i + 2) == 'b') {
					count++;
				}
			}
		}
		return count;

	}

	// Change character
	public static int changeChar(String A, int B) {
		int[] freq = new int[26];
		int uc = 0;
		for (int i = 0; i < A.length(); i++) {
			char curr = A.charAt(i);
			if (freq[curr - 'a'] == 0) {
				uc++;
			}
			freq[curr - 'a'] += 1;
		}
		Arrays.sort(freq);

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 0)
				continue;
			else {
				if (B < freq[i])
					break;
				B -= freq[i];
				uc--;
			}
		}
		return uc;
	}

	// Closest Palindrome
	public static String closestPalindrome(String A) {
		int n = A.length();
		int count = 0;// mismatch char count
		for (int i = 0; i < n / 2; i++) {
			if (A.charAt(i) != A.charAt(n - 1 - i))
				count++;
		}
		System.out.println("found mismatch -" + count);
		System.out.println(n % 2);
		if (n % 2 == 0 && count == 1) {
			System.out.println("HEre");
			return "YES";
		} else if (n % 2 != 0 && count <= 1) {
			System.out.println("Here");
			return "YES";
		} else {
			return "NO";
		}
	}

	// String Operations
	/*
	 * Concatenate the string with itself. Delete all the uppercase letters. Replace
	 * each vowel with '#'.
	 */
	public static String operations(String A) {
		HashSet<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		A = A + A;
		StringBuilder result = new StringBuilder();
		System.out.println(A);

		for (int i = 0; i < A.length(); i++) {

			if (!(A.charAt(i) >= 'A' && A.charAt(i) <= 'Z')) {
				System.out.println(A.charAt(i));
				if (vowels.contains(A.charAt(i)))
					result.append('#');
				else
					result.append(A.charAt(i));
			}

		}
		return result.toString();
	}

	public String getLargestOLD(String A) {

		String result = "";
		String[] S = A.split("_");
		Arrays.sort(S);
		int end = Math.min(S[0].length(), S[1].length());

		while (end > 0) {
			result += S[1].charAt(end - 1);
			end--;
		}
		result += S[0].substring(result.length(), S[0].length());
		return result;

	}

	// Lexicographically Largest
	public static String getLargest(String A) {
		
		String[] ST = A.split("_");
		StringBuilder S = new StringBuilder();
		S.append(ST[0]);
		StringBuilder T = new StringBuilder();
		int[] freq_T = new int[26];
		
		if(ST[1].length()>1) {
			char[] tmp = ST[1].toCharArray();
			Arrays.sort(tmp);
			T.append(tmp);
			T.reverse();
		}
		else {
			T.append(ST[1]);
		}
		for (int i = 0; i < T.length(); i++) {
			char curr = T.charAt(i);
			freq_T[curr - 'a'] += 1;
		}
		
		StringBuilder sb = new StringBuilder(ST[0]);

			for (int j = 0; j < S.length(); j++) {
				char current_char=S.charAt(j);
				for(int k=25;k>0;k--) {
					
				if ((k+'a')>current_char && freq_T[k]>0) {
					current_char=(char)(k+'a');
					freq_T[k]-=1;
					break;
				}
 
				}
				sb.setCharAt(j, current_char);
			}
		
		return sb.toString();

	}

	// Longest Common Prefix
	public static String longestCommonPrefix(List<String> A) {
		int size = A.size();

		if (size == 0)
			return "";

		if (size == 1)
			return A.get(0);

		Collections.sort(A);
		System.out.println(A);
		/* find the minimum length from first and last string */
		int end = Math.min(A.get(0).length(), A.get(size - 1).length());
		System.out.println(end);
		/*
		 * find the common prefix between the first and last string
		 */
		int i = 0;
		while (i < end && A.get(0).charAt(i) == A.get(size - 1).charAt(i)) {
			i++;
		}
		String pref = A.get(0).substring(0, i);

		return pref;
	}

	public static void main(String[] args) {
		// String A="ABEC";
		// System.out.println(getAmazingSubstrings(A));
		// String A = "bobob";
		// System.out.println(countOccurrences(A));
		// String A = "abcabbccd";
		// int B = 3;
		// System.out.println(changeChar(A, B));
		// String A = "abba";
		// System.out.println(closestPalindrome(A));
		// String A = "AbcaZeoB";
		// System.out.println(operations(A));
		String A = "ittmcsvmoa_jktvvblefw";
		//String A="abb_c";
		System.out.println(getLargest(A));
		// String[] A = { "abcdefgh", "aefghijk", "abcefgh" };
		// System.out.println(longestCommonPrefix(Arrays.asList(A)));
	}

}
