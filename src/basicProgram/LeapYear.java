package basicProgram;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		 boolean isLeap=false;
		 Scanner input;
		System.out.print("Enter Year is:");
		 input=	new Scanner(System.in);
		year=input.nextInt();
		if(year%4==0){
			// % Remainder
			
			if(year%100==0){
				
				
				if(year%400==0)
					
					isLeap=true;
				else 
					isLeap=false;
	}
			else{
				isLeap=true;
			}
			
		}
		
		
		else{
			isLeap=false;
		}
		
		
		
		if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
	
		
		
		
		
		
	}

}
