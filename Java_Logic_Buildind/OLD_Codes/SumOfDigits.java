// program to find the sum of digits of any number 
//123--------3+2+1=6

import java .util.Scanner;
class SumOfDigits
{
    public static void main(String []args)
    {
        int n,r,sum=0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r = n%10;
            sum = sum+r;
            n=n/10;
        }
        System.out.println("sum : "+sum);
    }
}