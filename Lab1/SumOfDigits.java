import java.util.Scanner;
class SumOfDigit
{
	static int num=0,sum=0;
	static void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number \n");
		num=sc.nextInt();
	}
	static void sum()
	{
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println("Sum of the Digits = "+sum);
	}
	public static void main(String[] args)
	{
		getdata();
		sum();
	}
}
