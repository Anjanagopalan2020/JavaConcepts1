package Concepts;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> a=new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(12);
		a1.add(20);
		a1.add(20);
		HashSet<Integer> a2=new HashSet<Integer>(a1);
		for (Integer i:a2)
		{
			System.out.println(i);
		}
		
		
		
	}

}
// contains unique elements
//uses hashtable internally
//allows null values
//will not maintain insertion order
