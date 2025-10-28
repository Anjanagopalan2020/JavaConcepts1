package Concept2;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Hashmaptest {
	
	public static Map<String,Integer>m2=new HashMap<>();
	
	static {
		m2.put("c", 300);
		m2.put("d",400);
	}

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<>();
		m1.put("a", 100);
		m1.put("b", 200);
		System.out.println(m1);
		
		//static hashmap
		
		System.out.println(Hashmaptest.m2.get("c"));
		
		//empty map
		Map<String,Integer>empty=Map.of();
		//empty.put("abc", 100);
		//System.out.println(empty);
		
		//singleton map
		Map<String,Integer>single=Map.of("k1", 1);
		System.out.println(single.get("k1"));
		//single.put("k2", 200);
		//System.out.println(single);
		
		//multimap
		Map<String,Integer>multymap=Map.of("k1", 1000, "k2", 2, "k3", 3, "k4", 4, "k5", 5,"k6",6,"k7",7,"k8",8,"k9",9,"k10",10);
		System.out.println(multymap.get("k1"));
		//multymap.put("k1", 500);
		//System.out.println(multymap);
		
		//immutable map
		Map<String,Integer>immutable=Map.ofEntries(
				new AbstractMap.SimpleEntry< >("a", 100),
				new AbstractMap.SimpleEntry< >("c", 200),
				new AbstractMap.SimpleEntry< >("b", 300)
				);
		System.out.println(immutable.get("b"));
		immutable.put("d", 400);
		//System.out.println(immutable);//unsupportedoperation exception
		
	}

}
