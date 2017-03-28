import java.util.Scanner;
abstract class Figure
{
	private double d1,d2;
	Figure(double a,double b)
	{
		d1=a;
		d2=b;
	}
	double getd1()
	{
		return d1;
	}
	double getd2()
	{
		return d2;
	}
	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double l,double b)
	{
		super(l,b);
	}
	double area()
	{
		return (getd1()*getd2());
	}
}
class Square extends Figure
{
	Square(double l)
	{
		super(l,0);
	}
	double area()
	{
		return (getd1()*getd1());
	}
}
class Triangle extends Figure
{
	Triangle(double l,double b)
	{
		super(l,b);
	}
	double area()
	{
		return (0.5*getd1()*getd2());
	}
}
class abs1
{
	public static void main(String args[])
	{
		Figure fr;
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of a rectangle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		fr=new Rectangle(l,b);
		System.out.println("Area of rectangle= "+fr.area());
		System.out.println("Enter the length square");
		l=sc.nextDouble();
		fr=new Square(l);
		System.out.println("Area of square= "+fr.area());
		System.out.println("Enter the base and height of a triangle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		fr=new Triangle(l,b);
		System.out.println("Area of triangle= "+fr.area());
	}
}
