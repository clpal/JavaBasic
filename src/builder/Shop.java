package builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new PhoneBuilder().setOs("Android").setRam(2).getphone();
		//Phone phone=new Phone("Android ",2,"qualcom",5.5,3100);
		System.out.print(p);
	}

}
