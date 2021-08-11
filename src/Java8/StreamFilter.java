package Java8;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		//Selecting names containing more than 5 characters
		         
		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
	
	}

}
