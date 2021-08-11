package EqualityDataReference;
class Emp{
	 public String name="";

}
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp emp=new Emp();
Emp emp1=new Emp();

//System.out.print(emp1==emp1);
System.out.print(emp.name==emp1.name);//same memory address true
System.out.print(emp.name.equals(emp1.name));
String s1= new String("abc");
String s2= new String("abc");

System.out.println(s1==s2);// difference  memory address
	}

}
