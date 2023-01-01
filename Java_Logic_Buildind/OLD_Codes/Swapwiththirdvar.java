/* program of  Swapping of two numbers with using third variable   */

import java.util.Scanner;
class Swapwiththirdvar
{
    public static void main(String [] args)
    {
        int a,b,temp;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();   //20
        b = sc.nextInt();   //30
        System.out.println("numbers before swapping: a = "+a+" and b = "+b);

        // logic for swapping with third variable

        temp = a;   //temp=20
        a = b;      //a=b=30
        b = temp;   //b=temp=20
       
        System.out.println("numbers after swapping : a = "+a+" and b = "+b);




        
    }
}