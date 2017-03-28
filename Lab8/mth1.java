class thMultiple extends Thread
{
	thMultiple(String name)
	{
		super(name);
		System.out.println("Child Thread - " + this);
		start();
	}
	
	public void run()
	{
		try 
		{
			for(int i = 5; i > 0; i--)
			{
				System.out.println("Child - " + this.getName() + " - " + i);
				Thread.sleep(100);
			}				
		}
		catch(InterruptedException e)
		{
			System.out.println("ChildInterrupted " + this.getName());
		}
		System.out.println("Child Interrupted");
	}
}
public class mth1 {
	
	public static void main(String[] args) {
		
		new thMultiple("th1");
		new thMultiple("th2");
		new thMultiple("th3");
		
		Thread main = Thread.currentThread();
		main.setName("Main");
		System.out.println("Main Thread - " + main);
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
			System.out.println("Thread " + main.getName());
		}
		System.out.println("Main Interrupted");		
	}

}
