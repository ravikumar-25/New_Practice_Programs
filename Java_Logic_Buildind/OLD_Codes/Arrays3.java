class Arrays3  //for ArrayOutOfBondExceptions
{
	public static void main(String args[])
	{
	   int [] arr = new int [4];
	   arr[0]=5;
	   arr[1]=10;
	   arr[2]=15;
	   arr[3]=20;
	   System.out.println("Trying to access elements within the array size");
	   for (int i=0;i<arr.length;i++)
	   {
	   System.out.println("Array Element at "+i+" is "+arr[i]);
	   }
	
	
	}


}