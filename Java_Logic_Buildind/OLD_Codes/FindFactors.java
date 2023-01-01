// find actors of a given integer number

import java .util.Scanner;
class FindFactors
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factors of "+n+" are : ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               System.out.print(i+" "); 
            }
        }
    }
}