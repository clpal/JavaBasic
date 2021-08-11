package thread;
   // https://www.youtube.com/watch?v=05b0b_ANoAI&t=268s
//wait(), notify() and notifyAll() methods in JAVA
class A extends Thread{
	   int t;
	   @Override
	public void run() {
		  synchronized (this) {
				for (int i = 0; i <= 10; i++) 
				     t=t+i;
					this.notify();
		}
	
	}
	   
   }
public class WaitNotifyThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
A a=new A();
a.start();
synchronized (a) {

	System.out.println("Main Thread");
	a.wait();
	
	System.out.println("Main Thread got notify");
	System.out.println(a.t);
	
}


	}

}

