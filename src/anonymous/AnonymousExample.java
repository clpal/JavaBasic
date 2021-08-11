package anonymous;
 class A {
	 public void display(){
			System.out.println("in A display");
		}
	public void show(){
		System.out.println("in A show");
	}
	
}
 class B  extends A{

	 public void show(){
			System.out.println("in B show");
			//super.show();
		}

}
public class AnonymousExample {

	public AnonymousExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		//A a=new B();
		//B a1=new B();
		//A a2=new A();
		//B a3=new A();
		//a.show();
		//a.display();
		//a1.show();
		//a2.show();
		//a3.show();
		A obj =new A(){
			@Override
			public void display() {
				// TODO Auto-generated method stub
	
				//super.display();
				System.out.println("in Annoymous method ");
			}
		};
		obj.display();
	}

}
