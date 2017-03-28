import java.util.Scanner;

public class stk {
	public static void main (String[] args) {
		int ch = 0;
		stack stck = new stack(5);
		while(ch == 0)
		{
			System.out.println("1.Push 2.Pop 3.Exit");
			System.out.print("Enter Choice - ");
			
			Scanner y = new Scanner(System.in);
			int z = y.nextInt();
			switch(z)
			{
				case 1: System.out.print("\nEnter Element - ");
						int temp = y.nextInt();
						try{stck.push(temp);}
						catch(PushException e)
						{System.out.println(e);}
						break;
				case 2: try
						{System.out.println(stck.pop());}
						catch(PopException e)
						{System.out.println(e);}
				 		break;
				case 3: ch = 1; break;
			}
		}
	
	}
}
class PopException extends Exception
{
	public String toptring()
	{
		return "String Underflow";
	}
}


class PushException extends Exception
{
	public String toptring()
	{
		return "String Overflow";
	}
}
class Exception
{
	private int stck[];
	private int top;
	private PopException popex = new PopException();
	private PushException pushex = new PushException();
	
	Exception(int size)
	{
		stck = new int[size];
		top = -1;
	}
	
	public void push(int item) throws PushException
	{
		if(top==stck.length-1)
			throw pushex;
		else
			stck[++top] = item;
	}
	
	public int pop() throws PopException
	{
		if(top==-1)
			throw popex;
		else
			return stck[top--];
	}
}
