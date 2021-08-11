package basicProgram;

import java.util.Scanner;

public class CheckEvenOdd {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.print("Enter any Integer number :");
		num=sc.nextInt();
		  if(num%2==0){
				System.out.print("Enter number is Even"); 
		  }
		  else{
			  System.out.print("Enter number is Odd"); 
		  }

	}

}
