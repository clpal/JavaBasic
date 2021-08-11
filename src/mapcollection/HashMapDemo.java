package mapcollection;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public HashMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer>hm=new HashMap<String,Integer>();
hm.put("a", new Integer(100));
hm.put("b", new Integer(200));
hm.put("c", new Integer(300));
hm.put("d", new Integer(400));
hm.put("b", new Integer(500));
hm.put(null, new Integer(600));
hm.put(null, new Integer(700));
hm.put(null, new Integer(800));
for( Map.Entry<String, Integer> me:hm.entrySet()){
	System.out.print(me.getKey()+ ":");
	System.out.println(me.getValue());
}



	}

}
