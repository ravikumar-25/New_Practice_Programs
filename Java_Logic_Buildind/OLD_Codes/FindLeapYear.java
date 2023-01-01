/* This is a program to find if some year is a leap year or not*/ 

import java.util.Scanner;
class FindLeapYear
{
    public static void main(String [] args)
    {
        int y;
        System.out.print("Enter any year to find its leap year or not : ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        if(y % 100== 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0)   //condition to be satisfied to be a leap year
        {                                                               //for a century year : divisible by 100 should be divisible by 400
            System.out.println(y+" is a leap year ");                   //not a century year : should not be divisible by 100 but must be divisible by 4 
        }

        else
        {
            System.out.println(y+" is not a leap year");
        }

    }
}
