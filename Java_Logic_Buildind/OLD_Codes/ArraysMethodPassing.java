class ArraysMethodPassing
{
	public static void main(String args[])
	{
	  int arr [] = {2,3,4,5,6};
		
	  sum(arr);
	
	
	}

	public static void sum(int[] aray)
	{
		
		int sum =0;
		
		for (int i=0;i<aray.length;i++)
		{
			sum= sum + aray[i];
			
		}
		System.out.println("Sum of Array Values : "+sum);
	}
	








}
