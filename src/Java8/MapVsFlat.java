package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlat {
	static List map = Arrays.asList(1,2,3,4);
	//static List listOfIntegers = Stream.of("1", "2", "3", "4") .map(Integer::valueOf) .collect(Collectors.toList());
	static List listOfIntegers = Stream.of(map) .map(Integer::valueOf) .collect(Collectors.toList());

	static List evens = Arrays.asList(2, 4, 6);
	static List odds = Arrays.asList(3, 5, 7);
	static List primes = Arrays.asList(2, 3, 5, 7, 11); 
	static List numbers = (List) Stream.of(evens, odds, primes) .flatMap(list -> list.stream()) .collect(Collectors.toList());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" list: " + listOfIntegers);
		System.out.println("flattend list: " + numbers);
	}

}
