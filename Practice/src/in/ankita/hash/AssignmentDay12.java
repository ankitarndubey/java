package in.ankita.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentDay12 {

	// Find pairs in array whose sum is already present
	public static int findPair(ArrayList<Integer> A) {
		int ans = 0;
		long sum;
		HashSet<Integer> set_A = new HashSet<>();
		for (int i : A) {
			set_A.add(i);
		}

		for (int i = 0; i < A.size(); i++) {
			for (int j = i + 1; j < A.size(); j++) {
				sum = 0;
				sum = A.get(i) + A.get(j);
				System.out.println(A.get(i) + "+" + A.get(j) + " : " + sum);
				if (set_A.contains(sum))
					ans++;
			}
		}
		return ans;
	}

	// Sub-array with 0 sum
	public static int findSubArray(ArrayList<Integer> A) {
		if(A.get(0)==0)
			return 0;
		Set<Long> set_A = new HashSet<>();
		set_A.add((long)A.get(0));
		List<Long> prefixSum = new ArrayList<Long>();
		prefixSum.add((long)A.get(0));
		
		for(int i=1;i<A.size();i++)
		{
			
			prefixSum.add(prefixSum.get(i-1)+A.get(i));
			//System.out.println(prefixSum.get(i));
			if(prefixSum.get(i)==0 || set_A.contains(prefixSum.get(i)))
				return 1;
			set_A.add(prefixSum.get(i));
		}

		return 0;
	}

	//Replicating Substring
	public static int isReplicating(int A, String B) {
		
		HashMap<Character,Integer> hash_B=new HashMap<>();
		
		for(int i =0; i <B.toCharArray().length;i++) {
			if(hash_B.containsKey(B.charAt(i)))
				hash_B.put(B.charAt(i), hash_B.get(B.charAt(i))+1);
			else
				hash_B.put(B.charAt(i), 1);
		}
		System.out.println(hash_B);
		/*ans=hash_B.entrySet().stream()
		.filter(a->a.getValue() % 2 ==0);*/
		
		for(int i : hash_B.values())
		{
			System.out.println(i);
			if(i%A==0)
				return 1;
			else
				return -1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList( 190, 713, 462, 963, 993, 934, -762, -810, 261, -699, 542, 321, -549, -767, -985, 53, -253, 461, -29, -9, 221, -135, 923, -912, 979, -832, 311, 171, -437, -750, -482, 636, 370, -526, 655, 169, 607, -214, 284, -86, 418, -380, 222, 898, -822, 667, 885, 723, 707, 398, 254, 535, -878, -52, 476, -882, 475, -619, 347, -422, 862, -292, -511, 539, -244, 98, 913, 33, -483, 644, 801, 347, 661, -223, -92, -61, -647, 979, -306, 285, 818, -254, 0 ));
		// System.out.println(findPair(A));
		System.out.println(findSubArray(A));
		//System.out.println(isReplicating(3, "aabaaaaabb"));
	}

}
