package dagger;

public class Mobile {

	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	Battery _battery;
	Processor _processor;
	public Mobile(Battery battery, Processor processor) {
		// TODO Auto-generated constructor stub
		this._battery=battery;
		this._processor=processor;
	}
	Mobile getMobile(){
		return new Mobile(_battery,_processor);
	
}
}
