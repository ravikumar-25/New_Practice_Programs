// PROGRAM TO FIND ARMSTRONG NUMBER

import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String [] args)
    {
        int n,c,rem,sum=0;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            sum = sum+(rem*rem*rem);
            n=n/10;

        }
        if(c==sum)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong number");
        
    }
}