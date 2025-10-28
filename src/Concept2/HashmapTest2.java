package Concept2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapTest2 {

	public static void main(String[] args) {
		Map<String,Integer>a=new HashMap<>();
		a.put("a", 100);
		a.put("b", 200);
		a.put("c", 300);
		
		Iterator<String>i1=a.keySet().iterator();
		while(i1.hasNext())
		{
			String b=i1.next();
			System.out.println(a.get(b));
		}
		
		Iterator<Entry<String,Integer>>i2=a.entrySet().iterator();
		while(i2.hasNext())
		{
			Entry<String,Integer>entry =i2.next();
			System.out.println(entry.getKey() + entry.getValue());
			
		}
		
		//a.forEach((<k,v>)-> System.out.println("key is" + k +"value is"+ v));
	}
		



}
//hashmap stores data as key value pair
// duplicate keys are not allowed
// one null key and multiple values
//non syncronised and non thread safe