// Program to reverse any number
//123 --------321

import java.util.Scanner;
class ReverseNumber
{
    public static void main(String [] args)
    {
        int n,r;
        System.out.println("Enter any Number to reverse");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("reverse of "+n+" is : ");
        while(n>0)
        {
            r = n%10;
            System.out.print(r+"");
            n = n/10;
        }
    }
}