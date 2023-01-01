import java.util.Scanner;

class PerfectNumberCheck
{
    public static void main(String[] args) 
    {
        int n,sum = 0;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        } 
        if(sum==n)
        {
            System.out.println("perfect Number");

        }
        else
        {
             System.out.println("not a perfect Number");

        }
    }
}