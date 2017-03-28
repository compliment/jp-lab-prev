class thRowSum extends Thread 
{
	int rowNo;
	int sum = 0;
	
	thRowSum(String name)
	{
		super(name);
		rowNo = Integer.parseInt(name);
		System.out.println("Row - " + rowNo);
		start();
	}
	
	public void run()
	{
		for(int i = 0; i < rowSum.matrix[rowNo].length; i++)
			sum += rowSum.matrix[rowNo][i];
		System.out.println("Sum for Row - " + rowNo + " - " + sum);
		rowSum.rowsum[rowNo] = sum;
		
	}
}
public class rowSum {

	static int [][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	static int [] rowsum = new int[matrix.length];
	static int finalsum = 0;
	
	public static void main(String[] args) {
		
		try
		{
			for(int i = 0; i < matrix.length; i++)
			{
				new thRowSum("" + i);
				Thread.sleep(50);
			}
			Thread.sleep(100);
			
			
			
			for(int i = 0; i < rowsum.length; i++)
			{
				finalsum += rowsum[i];
			
			Thread.sleep(50);
			}
			System.out.println("Final sum - "+finalsum);
		}
		catch(InterruptedException e)
		{
			System.out.println("MainInterrupted");
		}	
	}

}
