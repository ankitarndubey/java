package in.ankita.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignmentDay13 {
	// Sort by Color **Count Sort**
	public static void sortByColor(ArrayList<Integer> A) {
		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0)
				countZero++;
			else if (A.get(i) == 1)
				countOne++;
			else if (A.get(i) == 2)
				countTwo++;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			while (countZero > 0) {
				ans.add(0);
				countZero--;
			}
			while (countOne > 0) {
				ans.add(1);
				countOne--;
			}
			while (countTwo > 0) {
				ans.add(2);
				countTwo--;
			}
		}
		System.out.println(ans);
	}

	// Kth Smallest Element
	public static int kthsmallest(final List<Integer> A, int B) {
		//My Solution
        /*List<Integer> A1=new ArrayList<>(A);
      
        if(A1.size()==1)
        	return A1.get(B-1);
		int start = 0;
		ArrayList<Integer> list=new ArrayList<>();
		while (start < B) {
			int index=0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < A1.size(); i++) {
				if (A1.get(i) < min) {
					min = A1.get(i);
					index=i;
				}
			}
			System.out.println(min+" "+index);
			list.add(min);
			A1.remove(index);
			start++;
		}
		System.out.println(list);
		return list.get(B-1);*/
		 for (int i = 0; i < B; i++) {
	            int minn = Integer.MAX_VALUE, idx = 0;
	            for (int j = i; j < A.size(); j++) {
	            	
	                if (A.get(j) < minn) {
	                    minn = A.get(j);
	                    idx = j;
	                }
	            }
	            int tmp = A.get(i);
	            A.set(i, A.get(idx));
	            //A[i] = A[idx];
	            A.set(idx, tmp);
	        }
	        return A.get(B-1);
    }

	// Noble Integer
	public static int findNoble(ArrayList<Integer> A) {
		Collections.sort(A, Collections.reverseOrder());
		System.out.println(A);
		for (int i = 1; i < A.size(); i++) {
			if ((A.get(i)) == i && A.get(i) != A.get(i - 1)) {
				return 1;
			}
		}
		return -1;
	}

	//Arithmetic Progression?
	public static int canArrange(ArrayList<Integer> A) {
		int ans=0;
		
		Collections.sort(A);
		for(int i =1;i<A.size()-1;i++)
		{
			if(A.get(i)-A.get(i-1)==A.get(i+1)-A.get(i))
				ans=1;
			else {
				ans=0;
				break;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 0, 1,
		// 2));
		// sortByColor(A);
		// ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(47, 7));
		 //int B = 2;
		// System.out.println(kthsmallest(A, B));
		//ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, -2, 0, -3 ));
		//System.out.println(findNoble(A));
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,4, 1));
		System.out.println(canArrange(A));
	}
}
