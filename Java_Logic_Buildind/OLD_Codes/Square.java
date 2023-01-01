import java.util.Scanner;
class  Square
{
    public static void main (String [] args)
    {
        int n;
        System.out.print("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        double s = Math.sqrt(n);
        System.out.println("Square root of " +n+ " is "+s);


    }
}