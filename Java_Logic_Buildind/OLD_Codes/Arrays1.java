class Arrays1
{
	public static void main (String args[])
	{
	int arr[];
	arr=new int [5];
	arr[0]=10;
	arr[1]=12;
	arr[2]=25;
	arr[3]=30;
	arr[4]=40;
	int x= arr.length;
	System.out.println("Size = "+x);
	System.out.println("Size of Array arr[] : "+(arr.length));
	for(int i=0;i<arr.length;i++) //FOR LOOP
	 {
	   
	  System.out.println("Elements at index "+i+":"+arr[i]);
	 
	 }
	
	
	
	}
}
