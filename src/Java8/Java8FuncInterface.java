package Java8;
@FunctionalInterface
// annotation for functional interface
interface FuncInterface {
 
    public int multiply(int a, int b);
}
public class Java8FuncInterface {
 public static void main() {
		// TODO Auto-generated method stub
		FuncInterface total = (a, b) -> a * b;
        // simple operation of multiplication of 'a' and 'b'
        System.out.println("Result: "+total.multiply(3, 60));
	}
 public static void main(Integer[]ar) {
		// TODO Auto-generated method stub
		FuncInterface total = (a, b) -> a * b;
     // simple operation of multiplication of 'a' and 'b'
     System.out.println("Result: "+total.multiply(30, 60));
	}
}
