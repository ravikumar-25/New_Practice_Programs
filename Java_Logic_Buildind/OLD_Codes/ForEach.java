class ForEach
{
	public static void main(String args[])
	{
	 // int [] marks= new int []{10,20,30,40,50};
	  int [] marks= {10,20,30,40,50};
	  int highest_marks = maximum (marks);
	  System.out.println("The Highest Score is : "+highest_marks);

	}


	public static int maximum (int[] numbers)// int[] numbers= marks;
    {
	  int max = numbers[0];
	
	  for(int num : numbers)  // FOR-EACH LOOP;
							 // int num = numbers[i];
	   {
	    if(num > max)
	    {
		  max = num;
	    }
	   }  
	  return max;
    }








	
}