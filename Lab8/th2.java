import java.util.Scanner;
class NewThread extends Thread
{
		Thread t;
		
		NewThread()
		{
			super("newThread");
			System.out.println("Child Thread"+this);
			//t.start();
			start();
		}
	
  	//public void  run()
 {
 	try
 	{
 		for(int i=5;i>0;i--)
 		{
 		System.out.println("Child Thread"+i);
 		Thread.sleep(500);
 		}
 }
 	catch(InterruptedException e)
 { 
 		System.out.print("Child Interrupted");
 }
 		System.out.print("Exiting Child\n");
 }
 }
 class th2 
 {
 public static void main (String[] args)
 { 
 		new NewThread();
  	try
  {
 		for(int i=5;i>0;i--)
	{		
		System.out.println("Main Thread"  +i);
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
