package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[]a={"a","b","c"};
		System.out.println(Arrays.toString(a));
		List<String>list=new ArrayList<String>();
		for(String b:a)
		{
			list.add (b);
		}
		System.out.println(list);
		List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");    
		 
		 String[]abc=fruitList.toArray(new String[fruitList.size()]);
		 System.out.println(Arrays.toString(abc));
	}
	
	

}
