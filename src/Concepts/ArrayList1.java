package Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String>a=new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add(1, "anjana");
		a.addFirst("vipin");
		a.addLast("kukku");
		System.out.println(a);
		
		for(String abc:a)
		{
			System.out.println(abc);
		}
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator itr1=a.listIterator();
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.hasPrevious());
		}
		
		
		a.get(0);
		a.set(2, "vinila");
		a.removeLast();
		System.out.println(a);

	}

}
