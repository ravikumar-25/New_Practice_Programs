class Fibbonacci_Series_2
{
    static int n1=0,n2=1,n3=0;


    static void printFibonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
        


    }


     public static void main(String [] args)
     {
        int count = 10;
        System.out.print("Fibonacci series is : "+n1+" "+n2);  //printing first two numbers already taken 
        printFibonacci(count-2);  //(n-2) beacuse two numbers are already printed





     }


     


}