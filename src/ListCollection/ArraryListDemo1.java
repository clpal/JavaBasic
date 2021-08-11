package ListCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraryListDemo1 {

	public ArraryListDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list= new LinkedList<>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 System.out.println("LinkedList :"+list);
		 
		 
		 List arrlist= new ArrayList<>();
		 arrlist.add(1);
		 arrlist.add(2);
		 arrlist.add(3);
		 arrlist.add(4);
		 System.out.println("ArrayList :"+arrlist);
		
	}

}
