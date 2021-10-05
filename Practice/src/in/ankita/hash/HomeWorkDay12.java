package in.ankita.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWorkDay12 {

	// Hotel Occurrences
	public static void hotelOccurences(ArrayList<Integer> A) {
		HashMap<Integer, Integer> map_A = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {

			if (map_A.containsKey(A.get(i))) {
				map_A.put(A.get(i), map_A.get(A.get(i))+1);
				
			} else {
				
				map_A.put(A.get(i), 1);
			}
			
		}
		
		for(int i =0;i<A.size();i++) {
			System.out.print(A.get(i));
			if (map_A.get(A.get(i))==1) {
				ans.add(A.get(i));
			}
			else {
				map_A.put(A.get(i),map_A.get(A.get(i))-1);
			}
				
		}
		
		
		System.out.println(map_A);
		System.out.println(ans);

	}

	//Change Date Format
	public static void changeDateFormat(String A) {
		
		HashMap<String, String> months=new HashMap();
		months.put("Jan", "01");months.put("Feb", "02");months.put("Mar", "03");
		months.put("Apr", "04");months.put("May", "05");months.put("Jun", "06");
		months.put("Jul", "07");months.put("Aug", "08");months.put("Sep","09");
		months.put("Oct", "10");months.put("Nov", "11");months.put("Dec", "12");
		
		
		String[] date=A.split(" ");
		String year=date[2];
		String month=date[1];
		String num=date[0].substring(0,1);
		
		if(date[0].charAt(1)>='0' && date[0].charAt(1)<='9') {
			num=num+date[0].charAt(1);
		}else {
			num="0"+num;
		}
		if(months.containsKey(month))
			month=months.get(month);
		String ans=year+"-"+month+"-"+num;
		System.out.println(ans);
	}
	public static void main(String[] args) {
		//ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		//hotelOccurences(A);
		String A= "16th Mar 2068";
		changeDateFormat(A);

	}

}
