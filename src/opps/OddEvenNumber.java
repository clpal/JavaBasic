package opps;

import java.util.Scanner;

public class OddEvenNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%2==0 && N>2 && N<5){// even number
		
			System.out.print("Not Weird");
		}
		else if(N%2==1 && N>=6 && N<=20){// odd number
			System.out.print("Weird");
		}
		else if(N%2==1 && N<20){// odd number
			System.out.print("Not Weird");
		}
	}

}
