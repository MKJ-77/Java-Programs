package Overloading_Programs;


/**
 * Design a class to overload a function num_calc() as follows:
    a)void num_calc(int num, char ch) with one integer argument and one char argument, 
computes the square of integer argument if choice ch is 's‘ otherwise find its cube.
    b)void num_calc(int a, int b, char ch) with two integer arguments and character argument. 
It computes the product of integer arguments if ch is 'p' else adds the integers.
    c)void num_calc(String s1, String s2) with two string arguments,
which prints whether the strings are equal or not�
 */
public class calculate
{
    /**if choice ch is 's‘ otherwise find its cube*/
    void num_calc(int num , char ch)
    {
        if(ch=='s' || ch=='S')
        System.out.println("Square Of The Number "+num+" is "+(num*num));
        else
        System.out.println("Cube Of The Number "+num+" is "+(num*num*num));
    }
    /**It computes the product of Integer arguments if ch is 'p' else adds the Integers.*/
    void num_calc(int a , int b , char ch)
    {
        if(ch=='p' || ch=='P')
        System.out.println("Product Of The Number is "+(a*b));
        else
        System.out.println("Sum Of The Numbers is "+(a+b));
    }
    /**Prints whether the strings are equal or not*/
    void num_calc(String s1 , String s2)
    {
        if(s1.equalsIgnoreCase(s2))
        System.out.println("The two Strings are Equal.");
        else
        System.out.println("The two Strings are Not Equal.");
    }
}