class th5 extends Thread
{
		Thread t;
		
		th5()
		{
			super("th5");
			System.out.println("Child Thread"+this);
			
			start();
		}
	
  
 {
 	try
 	{
 		for(int i=1;i<10;i++)
 		{
 		System.out.println("Child Thread - 5*"+i+"="+i*5);
 		Thread.sleep(100);
 		}
 }
 	catch(InterruptedException e)
 { 
 		System.out.print("Child Interrupted");
 }
 		System.out.print("Exiting Child\n");
 }
 }
 class th7 extends Thread
{
		Thread t;
		
		th7()
		{
			super("th7");
			System.out.println("Child Thread"+this);
			
			start();
		}
	
  
 {
 	try
 	{
 		for(int i=1;i<10;i++)
 		{
 		System.out.println("Child Thread - 7*"+i+"="+i*7);
 		Thread.sleep(100);
 		}
 }
 	catch(InterruptedException e)
 { 
 		System.out.print("Child Interrupted");
 }
 		System.out.print("Exiting Child\n");
 }
 }
 class m2
 {
 public static void main (String[] args)
 { 
 		new m2();
  	try
  {
 		for(int i=1;i<10;i++)
	{		
		System.out.println("Main Thread"  +i+"="+i*7);
 		Thread.sleep(300);
 }
 }
 		catch(InterruptedException e)
 { 	
 		System.out.print("Main Interrupted");
 }
 		System.out.print("Exiting Main\n");
 }
 }
