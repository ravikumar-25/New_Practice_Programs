/* program to take input from user by using scanner class */

import java.util.Scanner;
class TakingUserInput
{
    public static void main(String [] args)
    {
        System.out.println("Taking input from the user");

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1 : ");
       int a = sc.nextInt();            //taking input any integer no     
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum : "+sum);

        System.out.println("Enter float numbers 1 :");
        float f1 = sc.nextFloat(); 
        System.out.println("Enter float numbers 2 :");     //taking input a float no
        float f2 = sc.nextFloat();
        float FloatSum = f1 + f2;
        System.out.println("sum of float nos: "+FloatSum);

        System.out.println("Enter any string 1 : ");
        String str = sc.next();     //it will only take the first word of complete string entered,till space
        System.out.println("String str is : "+str);
        // System.out.println("Enter any string 2 : ");
        //String str1 = sc.nextLine();  //it will take the complete string ,after space also
       // System.out.println("String str1 is : "+str1);

        //boolean b1 = sc.hasNextInt();  //hasNextInt() is to check whether the entered number is integer
        //System.out.println(b1);         //or not , if  u enter float then "false" will be output,
                                        //if u enter integer no then true will be output



    }


}