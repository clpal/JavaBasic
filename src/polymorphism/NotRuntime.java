package polymorphism;


class Base {
    public   void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public   void show() {
       System.out.println("Derived::show() called");
    }
}
public class NotRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();
        b.show();
    }
	}

// static keywords Run time polymorphism is not work
// no compiler error

//During compile time, the check is made on the reference type.
//However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.

  
