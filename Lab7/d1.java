import java.util.Scanner;
class Distance
{
	private int m;
	private float cm;
	private float m1;
	Distance()
	{
		m=0;cm=0;
	}
	
	Distance(int m, float cm)
	{
		this.m=m;
		this.cm=cm;
		normalize();
	}
	Distance(float m1)
	{
		this.m1=m1;
		
		normalize();
	}
	
	int normalize()
	{
		if (cm >=100)
		{
			int t= (int) cm/100;
			cm=cm%100;
			m=t+m;
			return m;
		}
		//display();
	}
	void display()
		{
		//int m1= (int) cm/100;
		//int cm1= (int)cm%100;
			System.out.println ("Meters: " +m+ "CentiMeters:"+cm);
		}
	Distance add(Distance d)
	{
	Distance d1 = new Distance();
	float s1,s2,s;
		s1= this.m*100+this.cm;
		s2= d.m*100+d.cm;
		s=s1+s2;
		d.m= (int) s/100;
		d.cm=s%100;
		return d;
	
		
	}
}
	
	class d1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m;
		float cm;float s1;
		/*
		Distance d1= new Distance();
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextFloat();
		cm=sc.nextFloat();
		*/
		System.out.println("Enter the distanceFloat");
		//m= sc.nextInt();
		s1=sc.nextFloat();
		Distance z=new Distance(s1);
		
		
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextInt();
		cm=sc.nextFloat();
		Distance x=new Distance(m,cm);
				//x.display();
		
		System.out.println("Enter the distance in metres and centimeters:");
		m= sc.nextInt();
		cm=sc.nextFloat();
		Distance y=new Distance();
		
		//y.display();
		
		Distance sum=new Distance();
		System.out.println("After addition");
		sum=y.add(x);
		sum.display();
		
	}
}
