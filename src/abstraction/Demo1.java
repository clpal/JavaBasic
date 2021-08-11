package abstraction;
abstract class MyClass{
	MyClass(){
		
	}
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract public void disp2();
	}

	class Demo1 extends MyClass{
	   /* Must Override this method while extending
	    * MyClas
	    */
	public	Demo1(){
		//super
			
		}
		  public void disp(){
			 // super.disp();
			     System.out.println("Child method of parent class");
			   }
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
		   MyClass obj = new Demo1();
	       obj.disp();
	   }
	}