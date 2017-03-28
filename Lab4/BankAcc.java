import java.util.Scanner;
class BankAcc
{
    String name;
    long acc;
    String actype;
    double bal;
    static int rate;
    static
    {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter the rate value");
    	rate=sc1.nextInt();
    }
    BankAcc()
    {
        name=null;
        acc=0;
        actype=null;
        bal=0.0;
    }
    BankAcc(String n,long ac,String at,double ba)
    {
        name=n;
        acc=ac;
        actype=at;
        bal=ba;
    }
    BankAcc(BankAcc a)
    {
        name=a.name;
        acc=a.acno;
        actype=a.actype;
        bal=a.balamt;
    }
    void deposit()
    {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter the amt to be deposited");
        double amt=sc1.nextDouble();
        bal+=amt;
    }
    void withdraw()
    {
    	Scanner sc2=new Scanner(System.in);
    	System.out.println("Enter the amt to be withdrawn");
        double amt=sc2.nextDouble();
        if(bal<=1000||bal<amt)
        System.out.println("Not enough balance");
        else
        bal-=amt;
    }
    void display()
    {
        System.out.println("Account holder : "+name+"\n Account number : "+acc+"\n Account type : "+actype+"\n Balance Amount : "+bal+"\n Interest Rate : "+rate);
    }
    static void displayr()
    {
        System.out.println("Rate of Interest from static method = "+rate);
    }
}
class BankDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n,at;
        double ba;
        long ac;
        int r;
       	int size;
       	System.out.println("Enter the number of accounts");
       	size=sc.nextInt();
       	BankAcc arr[]=new BankAcc[size];
       	BankAcc.displayr();
        for(int i=0;i<size;i++)
        {
        	System.out.println("Enter the name,actype,balamt,acno");
        	n=sc.nextLine();
        	at=sc.nextLine();
        	sc.nextLine();
        	ba=sc.nextDouble();
        	ac=sc.nextLong();
        	arr[i]=new BankAcc(n,ac,at,ba);
        	arr[i].deposit();
        	arr[i].withdraw();
        	arr[i].display();
        }
        BankAcc.displayr();
    }
}

