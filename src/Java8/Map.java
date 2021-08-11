package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
Answer: Map Stream operation gives one output value per input value whereas flatMap Stream operation gives zero or more output value per input value.

Map Example – Map Stream operation is generally used for simple operation on Stream such as the one mentioned below.

In this program, we have changed the characters of “Names” into the upper case using map operation after storing them in a Stream and with the help of the forEach Terminal operation, we have printed each element.*/
 
public class Map {
    public static void main(String[] str) {
        List<String> Names = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
 
        List<String> UpperCase = Names.stream().map(String::toUpperCase).collect(Collectors.toList());
        // Changed the characters into upper case after converting it into Stream
 
        UpperCase.forEach(System.out::println);
        // Printed using forEach Terminal Operation
    }
}