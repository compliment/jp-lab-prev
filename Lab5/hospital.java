import java.util.Scanner;
import java.util.GregorianCalendar;

public class hospital {

	public static void main(String[] args) {
		
		billing test = new billing();
		test.input();
		test.display();
		test.generate_Bill();
	}
}

class patient
{
	private String name;
	private int age;
	private long hospital_number;
	Scanner in = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter Patient Name - ");
		name = in.nextLine();
		System.out.println("\nEnter Patient Age - ");
		age = in.nextInt();
		System.out.println("\nEnter Hospital Number -");
		
		hospital_number = in.nextInt();
		System.out.println("\nPatient record stored");		
	}
	
	void display()
	{
				
		System.out.println("\n\nName - "+name+"\nAge - "+age);
		System.out.println("\nHospital Number - "+hospital_number);
	}
}

class inpatient extends patient
{
	private String department_name;
	protected int room_type;
	protected GregorianCalendar admission_date;
	
	void input()
	{
		super.input();
		System.out.println("\nEnter Department Name - ");
		department_name = in.nextLine();
		System.out.println("\nEnter Room Type 1.Special 2.SemiSpecial ");
		System.out.print("3.General - ");
		room_type = in.nextInt();
		System.out.println("\nEnter admission date DD MM YYYY - ");
		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();
		admission_date = new GregorianCalendar(y,m-1,d);
	}
	
	void display()
	{
		super.display();
		System.out.println("\n\nDepartment Name - "+department_name+"\nRoom Type - "+room_type);
		System.out.println("\ndate of admission - "+admission_date.get(GregorianCalendar.DATE));
		System.out.println("-"+admission_date.get(GregorianCalendar.MONTH)+"-"+admission_date.get(GregorianCalendar.YEAR));
	}
}

class billing extends inpatient
{
	private GregorianCalendar discharge_date;
	private int final_Cost = 0;
	
	void input()
	{
		super.input();
		System.out.println("\nEnter discharge date DD MM YYYY - ");
		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();
		discharge_date = new GregorianCalendar(y,m,d);
		
	}
	void generate_Bill()
	{
		long days = discharge_date.getTimeInMillis() - admission_date.getTimeInMillis();
		days = days/(1000*60*60*24);
		int totaldays = (int)days;
		
		
		System.out.print("\nNumber of days - "+totaldays);
		switch(room_type)
		{
			case 1: final_Cost = 1000*totaldays;break;
			case 2: final_Cost = 500*totaldays;break;
			case 3: final_Cost = 100*totaldays;break;
		   
		}
		System.out.println("\nTotal COst - "+final_Cost);
	}
}
