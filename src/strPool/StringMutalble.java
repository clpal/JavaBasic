package strPool;

public class StringMutalble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*  String s1="java";
    String s2=new String("java");
    System.out.print(s1==s2); // false 
*/    
		
		
		  String s1=new String("java");
		    String s2=s1.toUpperCase();
		    String s3=s1.toLowerCase();
		    System.out.println(s1==s2); // false 
		    System.out.println(s1==s3); // true 
	}

}
