package polymorphism;
class MyBaseClass1{
	   protected void disp()
	   {
	       System.out.println("Parent class method");
	   }
	}
	
public class OverridingAccess1 extends MyBaseClass1{
	public void disp(){
	      System.out.println("Child class method");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingAccess1 obj = new OverridingAccess1();
	      obj.disp();
	}

}
//o/p Child class method