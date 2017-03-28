class th5 extends Thread
{
	th5(String name)
	{
		super(name);
		System.out.println("Child Thread - " + this);
		start();
	}
	
	public void run()
	{
		try 
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("Child Thread - 5*"+i+"="+(i*5));
				System.out.println("Child - " + this.getName());
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
class th7 extends Thread
{
	th7(String name)
	{
		super(name);
		System.out.println("Child Thread - " + this);
		start();
	}
	
	public void run()
	{
		try 
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("Child Thread - 7*"+i+"="+(i*7));
				System.out.println("Child - " + this.getName());
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
public class multi {
	
	public static void main(String[] args) {
		
		new thMultiple("th5");
		new thMultiple("th7");
		
		
		Thread main = Thread.currentThread();
		main.setName("Main");
		System.out.println("Main Thread - " + main);
		try
		{
			for(int i=1;i<10;i++)
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
