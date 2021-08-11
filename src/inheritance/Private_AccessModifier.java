package inheritance;
class Base1 {
    public  void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived1 extends Base1 {
	private  void show() {
       System.out.println("Derived::show() called");
    }
}
public class Private_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b = new Derived1();
        b.show();
    }
	}