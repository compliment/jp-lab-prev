class Gen<T>
{
	T ob;
	Gen(T o)
	{
		ob=o;
	}
	T getob()
	{
		return ob;
	}
	void showtype()
	{
		System.out.println("Type of object: "+ob.getClass().getName());
	}
}
class GenDemo
{
	public static void main(String args[])
	{
		Gen<Integer>iob=new Gen<Integer>(20);
		iob.showtype();
		int v=iob.getob();
		System.out.println("Value: "+v);
		
		Gen<String>sob=new Gen<String>("Nish");
		sob.showtype();
		String s=sob.getob();
		System.out.println("Value: "+s);
	}
}
