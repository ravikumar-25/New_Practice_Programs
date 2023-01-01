// Program to find palindrome Number

import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String []args)
    {
        int n,c,r,sum=0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while(n>0)
        {
            r=n%10;
            sum = (sum*10)+r;
            n = n/10;
        }

        if(c==sum)
        System.out.println("Palindrome number");
        else
        System.out.println("Not a Palindrome number");


    }
}