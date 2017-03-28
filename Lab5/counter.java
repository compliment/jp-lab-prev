
	public class counter
	{
		static int c=0;
		counter()
			{
				c++;
			}
		counter(int a)
			{
				c++;
			}
		static void showCount()
			{
				System.out.println(c);
			}
	
		
		public static void main (String[] args)
		{
				counter b = new counter();
				counter b1 = new counter();
				showCount();
		}
	
		}
