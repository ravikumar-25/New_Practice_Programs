// This is a program to print day of a week using SWITCH CASE statement

import java.util.Scanner;
class PrintDayOfWeek
{
    public static void main(String [] args)
    {
        int n;
        
        System.out.println("codes of days of a week are as follows : ");
        System.out.println("for SUNDAY : code = 0 ");
        System.out.println("for MONDAY : code = 1 ");
        System.out.println("for TUESDAY : code = 2 ");
        System.out.println("for WEDNESDAY : code = 3 ");
        System.out.println("for THURSDAY : code = 4 ");
        System.out.println("for FRIDAY : code = 5 ");
        System.out.println("for SATURDAY : code = 6 ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Enter any code from above list to print any day of a week : ");
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch(n)
        {

            case 0:System.out.println("SUNDAY");
                break;
            case 1:System.out.println("MONDAY");
                break;
            case 2:System.out.println("TUESDAY");
                break;
            case 3:System.out.println("WEDNESDAY");
                break;
            case 4:System.out.println("THURSDAY");
                break;
            case 5:System.out.println("FRIDAY");
                break;
            case 6:System.out.println("SATURDAY");
                break;
            default:System.out.println("INVALID SELECTION");

        }
    }
}