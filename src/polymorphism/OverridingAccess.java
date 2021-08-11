package polymorphism;
class MyBaseClass{
	   public  void disp()
	   {
	       System.out.println("Parent class method");
	   }
	}
	class MyChildClass extends MyBaseClass{
		public void disp(){
			//protected
	      System.out.println("Child class method");
	   }
	   public static void main( String args[]) {
	      MyChildClass obj = new MyChildClass();
	      obj.disp();
	   }
	}
public class OverridingAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
