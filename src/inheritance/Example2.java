package inheritance;

abstract class Example5{
	   private int numOne=10;
	   protected final int numTwo=20;
	   public static final int numThree=500;
	   public  static final void display1(){
	      System.out.println("Num1="+numOne);
	   }
	}
 abstract class Demo {
	
	void show(){
		System.out.print(" Hello ");
	}
}
 
 
 
public class Example2  extends Example5{
	
	void show(){
		System.out.print("Java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example5 ex=new Example2();
		//ex.show();
		ex.display1();
	}

	

}
