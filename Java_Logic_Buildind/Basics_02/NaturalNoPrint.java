import java.util.Scanner;
public class NaturalNoPrint{
    public static void main(String[] args) {
       System.out.println("Enter any natural number to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("your no is : "+n);

        for(int i=n;i<=n+100;i++)
        {
            System.out.print(i+" ");
        }
    }
}