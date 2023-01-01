public class Literals
{
    public static void main(String [] args)
    {
        byte age = 34;  //boolean literals
        int age1 = 54;   //integer literals
        short age2 = 37;    //short literals
        long years = 52346598745221L; //long literals (suffix with :"l"or"L",
                                        //otherwise will be taken as integer literal and so cannot be stored in a long variable)
        char ch= 'A';       //character literal(should be enclosed within single colon: '')
        int chint = ch;     //character value is converted into integer value
        float f1 = 5.6f;       //float literals (shold be suffixed with "f",
                                // otherwise considered as double and so cannot be stored in a float variable,
                                //will show error "possibly lossy conversion").
        double d1 = 3.78;       //any decimal digit is considered as double data type by default so no need to mention but we can suffix them also as "d or D".
        boolean b = true;       //boolean data type can take only true and false as input value,default value is "false".
        String str = "HARRY";       //string literals
        System.out.println("age : "+age);
        System.out.println("age1 : "+age1);
        System.out.println("age2: "+age2);
        System.out.println("years : "+years);
        System.out.println("ch : "+ch);
        System.out.println("chint : "+chint);
        System.out.println("f1 : "+f1);
        System.out.println("d1 : "+d1);
        System.out.println("b : "+b);
        System.out.println("String str : "+str);

    }
}