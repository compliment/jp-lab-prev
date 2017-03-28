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
	void display()
	{
		System.out.println(a+"+"+"("+b+")i");
	}
	Complex add(Complex c2)
	{
		Complex temp=new Complex();
		temp.a=a+c2.a;
		temp.b=b+c2.b;
		return temp;
	}
	Complex sub(Complex c2)
	{
		Complex temp=new Complex();
		temp.a=a-c2.a;
		temp.b=b-c2.b;
		return temp;
	}
}
class ComplexDemo
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real and imaginary parts");
		a=sc.nextInt();
		b=sc.nextInt();
		Complex c1=new Complex(a,b);
		System.out.println("Enter the real and imaginary parts");
		a=sc.nextInt();
		b=sc.nextInt();
		Complex c2=new Complex(a,b);
		c1.display();
		c2.display();
		Complex c3=c1.add(c2);
		Complex c4=c1.sub(c2);
		System.out.println("After addition : ");
		c3.display();
		System.out.println("After subtraction : ");
		c4.display();
	}
}
