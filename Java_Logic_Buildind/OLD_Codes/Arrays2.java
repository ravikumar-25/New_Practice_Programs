class Arrays2  //for ArrayOutOfBondExceptions
{
	public static void main(String args[])
	{
	   int [] arr = new int [3];
	   arr[0]=5;
	   arr[1]=10;
	   arr[2]=15;
	   System.out.println("Trying to access elements outside the array size");
	   System.out.println(arr[3]);// java.lang.ArrayIndexOutOfBoundsException: 3
	
	
	
	}


}