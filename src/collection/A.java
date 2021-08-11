package collection;

import java.util.Collection;
import java.util.LinkedList;

public class A {
  public static Collection show(){
	  
	 Collection sorted= new LinkedList();
	 sorted.add("A");
	 sorted.add("R");
	 sorted.add("o");
	 sorted.add("N");
	// sorted.add("A");
	return sorted;
	 
 }
	public A() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Object obj: show()){
			System.out.print(obj + " ");
		}

	}

}
