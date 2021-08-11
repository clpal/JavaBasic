package polymorphism;


 class Parent {
	 void age(){
		 
	 }
	 public void newMethod(){
			System.out.println("new method of child class");
		   }
 }
 class Child  extends Parent {
	 void age(){
		 
	 }

 }
public class OverridingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Parent oj=new Parent(); // run
   Child obj1= new Child();// run
   Parent obj3 = new Child();// run
/* This is called dynamic method dispatch and run time polymoriphism*/
   Parent obj5=new Child();
      obj5.newMethod(); // run
  //Child obj4= new parent();// error
              
	}

}
