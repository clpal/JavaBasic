package collection;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public HashtableDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <String,Integer>hashtable=new Hashtable<String,Integer>();
		hashtable.put("Chhote", 100);
		hashtable.put("anju", 102);
		hashtable.put("lal", 103);
		Set<Entry<String, Integer>> val=hashtable.entrySet();
		for( Entry<String, Integer> val1:val){
			String mykey =val1.getKey();
			Integer myvalue =val1.getValue();
			
		}
		System.out.println("my key :" +mykey, "my value :"+myvalue);
	}

}
