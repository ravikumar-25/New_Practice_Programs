import java.util.*;
class JaggedArraysInput
{
	public static void main(String args[])
	{
	   System.out.println("Enter no rows of the arrayas");
	   Scanner sc=new Scanner(System.in);
	    int r= sc.nextInt();
	    
		int arr[][]=new int[r][];
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]= new int[i+1];
		}
		int count=0;
		System.out.println("Enter Elements of the arrayas");
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=0;j<arr[i].length;j++)
		  arr[i][j] = sc.nextInt();
		  
		}
		
		System.out.println("Displaying Elements of the arrayas");
		
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