package Concept2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeMap<String,Integer>a=new TreeMap<>(Comparator.reverseOrder());
		a.put("anj",1);
		a.put("vipi", 2);
		a.put("medha",3);
		System.out.println(a);
		a.get("anj");
		System.out.println(a.firstKey());
		System.out.println(a.lastKey());
		
		//System.out.println(a.headMap("vipi").keySet());
		//System.out.println(a.tailMap("vipi").keySet());
		//System.out.println(a.subMap("anj","vipi").keySet());
		
		

	}

}

//contains unique values
//maintain ascending order of keys
//TreeMap cannot have a null key but can have multiple null values.
//non synchronised