/* program of  Swapping of two numbers without using third variable   */

import java.util.Scanner;
class Swapwothirdvar
{
    public static void main(String [] args)
    {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();   //20
        b = sc.nextInt();   //30
        System.out.println("numbers before swapping: a = "+a+" and b = "+b);

        // logic for swapping without third variable

        a = a+b;    //a=20+30
        b = a-b;    //b=20+30-30=20
        a = a-b;    //a=20+30-20=30
        System.out.println("numbers after swapping : a = "+a+" and b = "+b);
        
    }
}