package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List list= new LinkedList<>();
 list.add(1);
 list.add(4);
 System.out.println("list: ");
 list.add("CL");
 list.add("Prakhar");

 System.out.println(list);
 System.out.println("list  add  in index data:");
 list.add(3,"Pal");

 System.out.println(list);
 System.out.println("list Set index : ");
 list.set(2,"four" );
 
 System.out.println(list);
 //System.out.println("list add all : ");
// list.addAll(list);
// System.out.println(list);
 System.out.println("list add all in index : ");
 list.addAll(2, list);
 System.out.println(list);
 
 System.out.println("Remove in index : ");
 list.remove(0);
 System.out.println(list);
 System.out.println("Remove list index of : ");
 list.indexOf("4");
 System.out.println(list);
 System.out.println("Remove list : ");
 list.removeAll(list);
 System.out.println(list);
	}

}
