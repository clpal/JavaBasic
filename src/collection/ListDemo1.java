package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List list= new ArrayList<>();
 List l=Collections.synchronizedList(list);
 list.add("Prakhar");
 list.add(1);
 list.add(4);
 list.add("CL");
 list.add("Prakhar");
 list.add(null);


 System.out.println("List:");
 System.out.println(list);
 
 
 
 System.out.println("remove:");
 list.lastIndexOf("Prakhar");
 
 System.out.println(list);
}}