/* program to convert lower case character into upper case and vice a versa*/

import java.util.Scanner;
class UpperToLowerCase
{
    public static void main (String[] args)
    {
        char ch , bh ;
        System.out.println(" enter any Character ");
        Scanner sc = new Scanner (System.in);
        ch = sc.next().charAt(0);
        System.out.println(" entered  Character : "+ch);

        if(ch>='A' && ch<='Z')
        {
            bh = Character.toLowerCase(ch);               //toLowerCase() is a method in Character class to convert 
            System.out.println("Lower Case Character : "+bh);   //upper case character into lower case
        }

        else
        {
            bh = Character.toUpperCase(ch);
            System.out.println("Upper Case Character : "+bh);
        }
    }

}