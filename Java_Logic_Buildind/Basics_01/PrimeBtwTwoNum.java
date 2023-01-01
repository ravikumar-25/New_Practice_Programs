import java.util.Scanner;
class PrimeBtwTwoNum
{
    public static void main(String[] args)
    {
        int num1,num2,i,j;
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for ( i = num1; i <= num2; i++)
        {
            for ( j = 2; j <= i; j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            {
            System.out.print(j+" ");
            }
        }

    }
}