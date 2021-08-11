package polymorphism;
//https://beginnersbook.com/2014/01/difference-between-method-overloading-and-overriding-in-java/
class CarClass
{
    public int speedLimit() 
    {
        return 100;
    }
}
class Ford extends CarClass
{
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
    	CarClass obj = new Ford();
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    }
}
/*Static methods can be overloaded which means a class can have more than one static method of same name.
Static methods cannot be overridden, even if you declare a same static method in child class
it has nothing to do with the same method of parent class.*/