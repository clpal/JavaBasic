package basicProgram;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isVowel=false;
Scanner sc=new Scanner(System.in);
System.out.println( "Enter Alphbet Number :");
 char ch=sc.next().charAt(0);
 sc.close();
 
 switch(ch){
 case 'a':
 case 'e':
 case 'i':
 case 'o':
 case 'u':
 case 'A':
 case 'E':
 case 'I':
 case 'O': 
 case 'U':
 
	 isVowel=true;

	}
 if( isVowel==true){
	 System.out.println( ch +" is Vowel");
 }
 else{
	 if(ch>'a'&& ch<'z' || ch>'A'&& ch<'Z')
		 System.out.println(ch+ " is consonent");
	 else
	 System.out.println( "Input is not alphabet");
 }
	}
}
