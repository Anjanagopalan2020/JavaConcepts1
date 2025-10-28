package Concepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(11);
		a1.add(21);
		a1.add(31);
		
		a.addAll(a1);
		System.out.println(a);
		
		a.addAll(1, a1);
		System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		Iterator itr=a.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
