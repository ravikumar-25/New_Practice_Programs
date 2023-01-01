class BitwiseOperator
{
	public static void main(String args[])
	{
		//initial values
		int a = 5;      //0101
		int b = 7;      //0111
		//bitwise AND
		//0101 & 0111=0101=5
		System.out.println("a&b = "+(a & b));
		
		//bitwise OR
		//0101 | 0111=7
		System.out.println("a|b = "+(a | b));
		
		//bitwise XOR
		//0101 ^ 0111 = 2
		
		System.out.println("a^b = "+(a ^ b));
		
		//bitwise NOT
		//~(5)00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
		//will give 2's complement of above conversion,00000000 00000000 00000000 00000110=(-6)
		
		System.out.println("~a = "+ ~a);
		
		//it can also combine with assignment operator
		//to provide shorthand assignment
		
		a &= b;
		System.out.println("a= "+a);
		
		String binary[]={
			"0000","0001","0010","0011","0100","0101",
			"0110","0111","1000","1001","1010",
			"1011","1100","1101","1110","1111"
		};
		
		
		int x = 3;	//0+2+1 or 0011 
		int y=6;	//4+2+0 or 0110 
		
		// bitwise OR
		
		int c = x|y;
		
		//bitwise AND
		
		int d = x & y;
		
		//bitwise XOR 
		
		int e = x^y;
		
		//bitwise NOT
		
		int f = (~x&y) | (x&~y);
		
	
		System.out.println("x= "+binary[x]);
		System.out.println("y= "+binary[y]);
		System.out.println("x|y= "+binary[c]);
		System.out.println("x&y= "+binary[d]);
		System.out.println("x^y= "+binary[e]);
		System.out.println("~x & y|x &~ y= "+binary[f]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}