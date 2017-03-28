import java.util.Scanner;
class Complex
{
	int a,b;
	Complex()
	{
		a=0;b=0;
	}
	Complex (int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Complex (Complex c)
	{
		a=c.a;
		b=c.b;
	}
	void display()
	{
		System.out.println(a+"+"+"("+b+")i");                                                                                    
	}
}
class ComplexConst
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);

Complex c1=new Complex();
c1.display();
System.out.println("Enter the real and imaginary parts of the complex number");
a=sc.nextInt();
b=sc.nextInt();

Complex c2=new Complex(a,b);
c2.display();

Complex c3=new Complex(c2);
c3.display();
	}
}

