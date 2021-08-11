package mypack;
import pack.*;  
// https://www.javatpoint.com/access-modifiers
public class B  {

	//void msg(){System.out.println("Hello java");}//C.T.Error  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj = new A();//Compile Time Error  
		C obj = new C();
		   obj.msg();//Compile Time Error  
	}

}
