package callbyvalueref;

public class CallbyValueRef {
static	class Ref{
		 static int y=111;
	}

public static void change(Ref y){
	//x=171;
	int xx=Ref.y;
	
	System.out.print(xx);
}
public static void change(int x){
	//x=171;
	x=Ref.y;
	
	System.out.print(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
		
		change(x);
		
		// java call by reference 
	}

}
