package builder;

public class Phone {
	// https://www.youtube.com/watch?v=k4EkJgY9P4c
	// Builder Pattern Creational Design Pattern
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	 Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	

}