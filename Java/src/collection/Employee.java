package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Employee {

public static void main(String[] args) {
	Map<Integer,String>map=new HashMap<>();
	/// Map<String,String> map = new LinkedHashMap<>();
	 map.put( 33,"Active");
	 map.put( 3,"Renewals Completed");
	 map.put( 15,"Application");
	 Map.Entry<Integer,String> entry = map.entrySet().iterator().next();
	 Integer key= entry.getKey();
	 String value=entry.getValue();
	// System.out.println(key);
	 //System.out.println(value);
	 
	 for(Map.Entry<Integer, String>entry1:map.entrySet()) {
		 Integer key1=entry1.getKey();
		 String val=entry1.getValue();
		 
		 if(val.startsWith("A")) {
			 System.out.println(entry1.getKey()+""+entry1.getValue());
		 }
	 }
	  
}	
	
}
