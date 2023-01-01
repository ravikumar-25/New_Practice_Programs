class ArraysMethodReturning
{
	public static void main(String args[])
	{
	  int arr [] = method();
		
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+"  ");
	  }
	
	}

	public static int[] method()
	{
		return new int []{1,2,3};	//returning array
		
	}
	








}
