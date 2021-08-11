package thread;

public class MyRunnable implements Runnable{
	private String name;
	MyRunnable(String name){
		this.name=name;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
				System.out.println("start thread: "+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("End thread: "+name);
	}

}
