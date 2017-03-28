import java.util.Scanner;
class arr
{ 	
	public static void main (String[] arr)
	{
		System.out.print("Enter the limit of array \n");
		Scanner a= new Scanner(System.in);
		int n = a.nextInt();
		int x[];
		int found=0;
         	x=new int[n];
         	for (int i = 0; i < n; i++)
         	{
      			x[i] = a.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		
			System.out.print(x[i]+"");
			
		}
		System.out.print("Enter the elements to be searched \n");
				n = a.nextInt();
		for(int i=0;i<n;i++)
		{
			if (x[i]==n)
			{
				found=1;
				System.out.print("Element found at"+i);
				break;
		       } 
	   		else 
			{
			 System.out.print("element not found \n");	
			}
		}
	}	
}
