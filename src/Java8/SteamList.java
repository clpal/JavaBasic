package Java8;

import java.util.ArrayList;
import java.util.List;

public class SteamList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = new ArrayList<>();
        
		listOfStrings.add("One");
		         
		listOfStrings.add("Two");
		         
		listOfStrings.add("Three");
		         
		listOfStrings.stream().forEach(System.out::println);
	}

}
