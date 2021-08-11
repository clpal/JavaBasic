package polymorphism;
/*If a class is extending an abstract class or implementing an interface then it has to
override all the abstract methods unless the class itself is a abstract class.*/
interface InterfaceExample{
	abstract  void dis1();
	static  void show(){
		
	}
}
 abstract class ParentClass implements InterfaceExample {
	
 public abstract  void diso1();
 }
 
 abstract  class Childclass extends ParentClass implements InterfaceExample {

		

}

  public class OverridingAbstract extends Childclass implements InterfaceExample {

	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diso1() {
		// TODO Auto-generated method stub
		
	}

	

}
