import java.util.Scanner;
class Distance
{
	private float m;
	private float cm;
	Distance()
	{
		m=0;cm=0;
		
	}
	
	Distance(float m, float cm)
	{
		this.m=m;
		this.cm=cm;
		normalize();
	}
	
	void normalize()
	{
		if (cm >=100)
		{
			int t= (int)cm/100;
			cm=cm%100;
			m=t+m;
		}
		//display();
	}
	void display()
		{
			System.out.println ("Meters: " +m+ "CentiMeters:"+cm);
		}
	Distance add(Distance d)
	{
	Distance d1 = new Distance();
	int s1,s2,s;
		s1= (int)this.m*100+(int)this.cm;
		s2= (int)d.m*100+(int)d.cm;
		s=s1+s2;
		d.m= (int)s/100;
		d.cm= (int)s%100;
		return d;
	
		
	}
}
	
	class DistanceDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float m,cm;
		/*
		Distance d1= new Distance();
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextFloat();
		cm=sc.nextFloat();
		*/
		
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextFloat();
		cm=sc.nextFloat();
		Distance x=new Distance(m,cm);
		//x.normalize(cm);
		x.display();
		
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextFloat();
		cm=sc.nextFloat();
		Distance y=new Distance(m,cm);
		//y.normalize(cm);
		y.display();
		
		Distance sum=new Distance();
		System.out.println("After addition");
		sum=y.add(x);
		sum.display();
		
	}
}
