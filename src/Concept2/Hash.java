package Concept2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {
		Map<String,Integer>a=new HashMap<>();
		a.put("anjana", 1);
		a.put("anjali",2);
		a.put("jithin", 13);
		a.put("anwar",18);
		System.out.println(a);
		
		System.out.println(a.keySet());
		
		System.out.println(a.values());
		
		System.out.println(a.entrySet());
		
		Iterator<String> i1=a.keySet().iterator();
		while(i1.hasNext())
		{
			String b=i1.next();
			System.out.println(a.get(b));
		}
		
		for(Map.Entry<String, Integer>m1:a.entrySet())
		{
			System.out.println(m1.getKey()+ m1.getValue());
		}
		 
		a.remove("anjana");
		a.remove("anjali",2);
		System.out.println(a);
		
		System.out.println(a.containsValue(13));
		
	}

}
