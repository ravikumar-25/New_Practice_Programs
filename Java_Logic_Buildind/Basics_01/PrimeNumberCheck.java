import java.util.Scanner;
public class PrimeNumberCheck
{
    public static void main(String[] args)
    {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if(n %i == 0)
            {
                count++;
            }
            

        }

        if(count==2)
        {
            System.out.println("Prime number");
        }
        else
        {
             System.out.println("Not a Prime number");
        }

    }
}