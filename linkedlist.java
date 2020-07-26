package programs;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("My Name");
		ll.add("Akshay");
		ll.add(1, "is");

		for (int i = 0; i < ll.size(); i++) {

			System.out.print(ll.get(i) + " ");
		}

		System.out.println();

		
		for (String str : ll)
			System.out.print(str + " ");
	}
}
