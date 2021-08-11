package factorydesign;

import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {
public static void main(String []args){
	
	OperatingSystemFactory osf=new OperatingSystemFactory();
//OS osf=	new Windows();
	OS obj=osf.getInstance("Open");
obj.spec();
}
}
