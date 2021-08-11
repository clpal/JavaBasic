package clonedemo;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ABC obj= new ABC();
		obj.i=5;
		obj.j=6;	
		ABC obj1=(ABC)obj.clone();
	//	System.out.println(obj);
		//  ABC obj1=obj;
		//ABC obj1=new ABC();
		//obj1.i=10;
		//obj1.j=11;
		//Shallow copy + Deep Copy= Colonable
		
		///obj1.i=obj.i;
		//obj1.j=obj.j;
		obj1.j=8;
		
	System.out.println(obj);
	System.out.println(obj1);
	
	}
	

}
class ABC implements Cloneable{
	int i=5;
	int j=6;
	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
}
