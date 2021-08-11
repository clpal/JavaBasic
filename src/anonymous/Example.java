package anonymous;
interface ExampleInterface{
	void display();
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleInterface exampleInterface=new ExampleInterface(){

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Derived::show() called");
	}
	 
 };
 exampleInterface.display();
	}

}
