class TernaryOperator
//java program to find max of three no using ternary operator
{
	public static void main(String args[])
	{
		int a=30,b=32,c=33,result;
	
		//result holds maximum of three nos
	
		result = ((a>b) ? (a>c) ? a : c : (b>c) ? b : c );
	
		System.out.println("Maximum of three numbers is "+result);
	
	
	
	
	
	}




}