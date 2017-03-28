class thMultiple implements Runnable 
{
	Thread t;
	
	thMultiple(String name)
	{
		t = new Thread(this,name);
		System.out.println("Child Thread - " + t);
		t.start();
	}
	
	public void run()
	{
		try 
		{
			for(int i = 5; i > 0; i--)
			{
				System.out.println("Child - " + t.getName() + " - " + i);
				Thread.sleep(100);
			}				
		}
		catch(InterruptedException e)
		{
			System.out.println("ChildInterrupted" + t.getName());
		}
		System.out.println("Child Interrupted " + t.getName());
	}	
}public class mth {
	
	public static void main(String[] args) {
		
		new thMultiple("th1");
		new thMultiple("th2");
		new thMultiple("th3");
		
		Thread main = Thread.currentThread();
		main.setName("Main");
		System.out.println("Main Thread - "+main);
		try 
		{
			for(int i = 5; i > 0; i--)
			{
				System.out.println("Main - " + i);
				Thread.sleep(200);
			}				
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted");
		}
		System.out.println("Main Interrupted");
	}

}
