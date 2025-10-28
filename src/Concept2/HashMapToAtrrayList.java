package Concept2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapToAtrrayList {

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<>();
		m1.put("a", 200);
		m1.put("d", 20);
		m1.put("c", 1050);
		Iterator<Entry<String,Integer>>e=m1.entrySet().iterator();
		while(e.hasNext())
		{
			Entry<String,Integer>e1=e.next();
			System.out.println("key is " + e1.getKey()+"value is "+e1.getValue());
		}
		
		List<String>a1=new  ArrayList<String>(m1.keySet());
		for(String s1:a1)
		{
			System.out.println(s1);
		}
		
		List<Integer>a2=new  ArrayList<Integer>(m1.values());
		for(Integer b:a2)
		{
			System.out.println("values are"+b);
		}
		System.out.println(a2);
Collections.sort(a2);	
System.out.println(a2);
		//convert to syncronized hashmap
		Map<String,Integer>m2=Collections.synchronizedMap(m1);
		System.out.println(m2);
		
		//concurrent hashmap
		ConcurrentHashMap<String,Integer>m3=new ConcurrentHashMap<String,Integer>();
		m3.put("a",1);
		m3.put("b", 2);
		System.out.println(m3.get("a"));
		
		
		
		Map<String,Integer>m4=new TreeMap<>(m1);	
		System.out.println(m4);
		for(Map.Entry<String, Integer>abc:m1.entrySet())
		{
			System.out.println("key: " + abc.getKey() + ", value: " + abc.getValue());  
		}
	}

}
