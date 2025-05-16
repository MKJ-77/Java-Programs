package Functions;
import java.util.*;
/**
 * Define a class NumtoWords with following details:
 * Class name : NumtoWords
 * Data menbers:
 * int n	:	to store the number
 * String s :	to store the word equivalent
 * For eg. If the number is 123 then the output will be ONE TWO THREE
 * Member functions:
 * NumtoWords(in x)	:parameterized constructor to assign the value of a to n ie n = a;
 * String toWords(int a):to return the word equivalent of the digit in a
 * void convert()	:converts the number to word using the function toWord()
 * void display()       :to display the number and the Word equivalent
 * Specify the class NumtoWords giving details of the constructor and the  
 * functions. Define a main() method to create an object and call the functions to enable
 * the task.
 */ class Num_to_Words
{
    String s;
    int n;
    public Num_to_Words(int a)
    {
        s="";
        n=a;
    }

    public void convert()
    {
        int a=n,r=0;
        while (a != 0)
        {
            r=a%10;
            s+=toWord(r);
            a/=10;
        }
        StringBuffer bf= new StringBuffer (s);
        s= bf.reverse().toString();
    }

    public String toWord(int a)
    {
        String s="";
        switch(a)
        {
            case 0:
            s= "oreZ" + "  ";
            break;
            case 1:
            s= "enO" + "  ";
            break;
            case 2:
            s= "owT" + "  ";
            break;
            case 3:
            s= "eerhT" + "  ";
            break;
            case 4:
            s= "ruoF" + "  ";
            break;
            case 5:
            s= "eviF" + "  ";
            break;
            case 6:
            s= "xiS" + "  ";
            break;
            case 7:
            s= "neveS" + "  ";
            break;
            case 8:
            s= "thgiE" + "  ";
            break;
            case 9:
            s= "eniN" + "  ";
            break;
        }
        return s;
    }

    public void display()
    {
        System.out.println("Word Equlvalent: "+s);
    }

    public static void main()
    {
        int a;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Number");
        a=sc.nextInt();
        Num_to_Words ob= new Num_to_Words(a);
        ob.convert();
        ob.display();
    }
}