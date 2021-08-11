package polymorphism;

//https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/
// method overloading with promotion arugments
public class DemoExample {
  void dis(int i,double d){
	  System.out .println("method A");
  }
  
  void dis(int i,double d,double d1){
	  System.out .println("method B");
  }
  void dis(int i,float f){
	  System.out .println("method C");
  }
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DemoExample demo=new DemoExample();
  demo.dis(10, 10.00f);
	}

}
