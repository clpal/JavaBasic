package basicProgram;

import java.util.Scanner;

// https://beginnersbook.com/2017/09/java-examples/

// https://www.programiz.com/java-programming/examples/graph-implementation
public class AddTwoNumbers {

	public static void main(String[] args) {
		 float num1,num2,num3,sum;
		 
		 Scanner sc;
		 
		// TODO Auto-generated method stub
		 sc= new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		num1=sc.nextFloat();
		
		System.out.println("Enter Second Number:");
		num2=sc.nextFloat();
		System.out.println("Enter Third Number:");
		
		num3=sc.nextFloat();
		sc.close();
		
		sum=num1+ num2+num3;
		System.out.print("Sum of These Numbers:" +sum);
		
	}

}
