package Concepts;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer>a=new TreeSet<Integer>();
		a.addLast(6);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		
		System.out.println(a);
		
		a.pollFirst();
		System.out.println(a);
		
		a.pollLast();
		System.out.println(a);
		

	}

}
