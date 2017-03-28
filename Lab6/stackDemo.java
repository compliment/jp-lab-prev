import java.util.Scanner;
interface stack
{
	void push(int ele);
	int pop();
	void display();
}
class fixedStack implements stack
{
	int stck[];
	int top;
	
	fixedStack(int size)
	{
		stck = new int[size];
		top = -1;
	}
public void push(int ele)
	{
		if(top==stck.length-1)
			System.out.println("Stack Overflow");
		else
			stck[++top] = ele;
	}
	
public int pop()
	{
		if(top==-1){
		System.out.println("Stack Underflow");
			return -99;}
		else
		return stck[top--];
		}
	public void display()
	{
		for(int i=top;i>=0;i--)
			System.out.println(stck[i]);
	}
	}
	

class dynamicStack implements stack
{
	public int stck[];
	public int top;
	 dynamicStack(int size)
	 {
	 stck = new int[size];
	 top=-1;
	 }
	 public void push(int ele)
	 {
	 if(top==stck.length-1)
	 {
	 int [] temp =new int[stck.length*2];
	 for (int i=0; i<stck.length; i++)
	 	{temp[i]=stck[i];
	 	temp=stck;}
	 	stck[++top]=ele;
	 }
			
		else
			stck[++top] = ele;
			}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stck[top--];
	}
	public void display()
	{
		for(int i=top;i>=0;i--)
			System.out.println(stck[i]);
	}
	}
	class stackDemo
	{
	public static void main (String[] args)
	{
	{	/*
		fixedStack f = new fixedStack();
		dynamicStack d = new dynamicStack();
		
		for(int i = 0; i < 10; i++)
		{
			d.push(i);
			if(i<5)
				f.push(i);
		}
		System.out.println("Fixed stack elements - ");
		for(int i=0;i<5;i++)
			System.out.print(""+f.pop()+" ");
		System.out.println("");
		System.out.println("Dynamic stack elements - ");
		for(int i=0;i<10;i++)
			System.out.print(""+d.pop()+" ");
		System.out.println("");
		f.pop();
		d.pop();
		*/
		stack s;
		s=new fixedStack(10);
		s.push(10);
		s.display();
		s=new dynamicStack(10);
		s.push(20);
		s.display();
	}
}
}
	
