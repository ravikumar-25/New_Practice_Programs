class JaggedArrays
{
	public static void main(String args [])
	{
		//int arr[][] = new int [3][];
		//arr[0] = new int[2];
		//arr[1]= new int[3];
		//arr [2]= new int [4];
		
		int arr [][]={
			{1,2,3,4,5,},
				{5,6,7,},
					{8,9,23}
			};
		
		/*int count=0;
		for(int i=0;i<arr.length;i++)
		{
		  for (int j=0;j<arr[i].length;j++)
		  {
		    arr[i][j]=count++;
		  
		  }
		
		}
	*/
		System.out.println("Displaying the contents of the jagged arrays");
		
		for(int i=0;i<arr.length;i++)
		{
		   for(int j=0;j<arr[i].length;j++)
		   {
		     System.out.print(arr[i][j]+" ");
		   }
			System.out.println();
		}
	
	}
}
