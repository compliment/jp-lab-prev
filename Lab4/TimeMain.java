import java.util.Scanner;
class Time 
{ 
	int sec, min, hr;
	Time()
	{
		sec=0;min=0;hr=0;
	}
	Time(int hr, int min, int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void display()
	{
		System.out.println ("Hr:Min:Sec = "+hr+":"+min+":"+sec);
	}
	void conversion(int hr, int min, int sec)
	{
		hr=(hr+min)/60 + sec/3600;
		min= min%60;
		sec=sec%3600;
		min=(min+sec)/60;
		sec=sec%60;
	}
	Time add (Time t)
	{
	Time t2=new Time();
	int s1,s2,s;
		s1= this.hr*3600+this.min*60+this.sec;
		s2= t.hr*3600+t.min*60+t.sec;
		s=s1+s2;
		s=s%3600;
		t2.min=s/60;
		t2.sec=s%60;
		return t2;
	
	}
	Time sub(Time t)
	{
		Time t1= new Time ();
		int s1,s2,s;
		s1= this.hr*3600+this.min*60+this.sec;
		s2= t.hr*3600+t.min*60+t.sec;
		s=(s1>s2)?(s1-s2):(s2-s1);
		s=s%3600;
		t1.min=s/60;
		t1.sec=s%60;
		return t1;
	}
	}

	class TimeMain
	{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
  int hr,min,sec;
  
	System.out.println("Enter the time in hours, minutes and seconds");
	hr=sc.nextInt();
	min=sc.nextInt();
	sec=sc.nextInt();
	Time x=new Time(hr,min,sec);
	x.conversion(hr, min, sec);
	x.display();
		
		System.out.println("Enter the time in hours,  mintues and second");
		hr=sc.nextInt();
		min=sc.nextInt();
		sec=sc.nextInt();
		Time y=new Time(hr,min,sec);
		y.conversion(hr, min, sec);
		y.display();
		
	
	Time sum=new Time();
	System.out.println("After addition");
	sum=y.add(x);
	sum.display();
	Time sub= new Time();
	System.out.println("After subtraction");
	sub=y.sub(x);
	y.display();
	
	
		}
	}




