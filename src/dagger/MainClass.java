package dagger;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor processor=new Processor();
		Battery battery=new Battery();
		Mobile mobile=new Mobile(battery,processor);
		mobile.getMobile();
	}

}
