package abstraction;
//abstract parent class
abstract class Animal{
 //abstract method
 public abstract void sound();
 public void show(){
	System.out.println("show");
 }
}
//Dog class extends Animal class
public class Dog extends Animal{

 public void sound(){
	System.out.println("Woof");
 }
 
 public void show(){
	System.out.println("show");
 }
 public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
 }
}