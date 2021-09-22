package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASAS IS REQUIRED
//A class to represent a order. 
class Order {
	String orderId;
	String metdata;

	public Order(String orderId, String metdata) {
		super();
		this.orderId = orderId;
		this.metdata = metdata;
	}

	@Override
	public String toString() {
		return "Student [orderId=" + orderId + ", metdata=" + metdata + "]";
	}

}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOrders = sc.nextInt();
		int T=numOrders;
		List<String> ordersList= new ArrayList<String>(numOrders);
		while(T>=0) {
			ordersList.add(sc.nextLine());
			T--;
		}
		
		//System.out.println(ordersList);
		ordersList.remove(0);
		System.out.println(ordersList);
		List<Order> orderList = new ArrayList(numOrders);
		String order;
		String[] _order = new String[2];
		for (int i = 0; i < ordersList.size(); i++) {
			if(ordersList.get(i)==null || ordersList.get(i).isEmpty()) {
				break;
			}
			System.out.println(ordersList.get(i));
			order = ordersList.get(i);
			_order = order.split("\\s+");
			System.out.println(_order[0]);
			orderList.add(new Order(_order[0], _order[1]));
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(_order[i]);
		}
		// System.out.println(orderList);
		Solution sol = new Solution();
		orderList = sol.prioritizedOrders(numOrders, orderList);
		System.out.println(orderList);

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<Order> prioritizedOrders(int numOrders, List<Order> orderList) {

		return orderList;

	}
	// METHOD SIGNATURE ENDS
}