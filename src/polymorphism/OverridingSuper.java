package polymorphism;
class ABCSuper{
	   public void myMethod()
	   {
		System.out.println(" parent Overridden method");
	   }	   
	}
public class OverridingSuper extends ABCSuper {
	 public void myMethod()
	   {
		//This will call the myMethod() of parent class
		super.myMethod();
		//System.out.println(" child Overridden method");
		
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCSuper obj= new OverridingSuper();
		obj.myMethod();
	}
}
