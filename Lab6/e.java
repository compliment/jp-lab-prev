
import java.io.*;
class employee
{
	String name;
	int age;
	double grossSalary;
	float takeHomeSalary;
	char grade;
	
	void input()
	{
	
		try
		{
			InputStreamReader irr = new InputStreamReader(System.in);	
			BufferedReader br= new BufferedReader (irr);
			System.out.print("\nName - ");
			name = br.readLine();
			System.out.print("\nAge - ");
			age = Integer.parseInt(br.readLine());
			System.out.print("\ngrossSalary - ");
			grossSalary = Double.parseDouble(br.readLine());
			System.out.print("\ntakeHomeSalary - ");
			takeHomeSalary = Float.parseFloat(br.readLine());
			System.out.print("\nGrade - ");
			grade = (char)System.in.read();
			
		}
		catch(Exception e)
		{
			System.out.println("INVALID INPUT\nplease re-enter all details");
			input();		
		}
	}
	
	void display()
	{
		System.out.println("\nName - "+name+"\nAge - "+age);
		System.out.println("grossSalary - "+grossSalary+"\ntakeHomeSalary"+takeHomeSalary);
		System.out.println("Grade - "+grade);
	}
}
class e
{
	public static void main (String[] args)
	{
		employee ep= new employee() ;
		ep.input();
		ep.display();
	}
}
