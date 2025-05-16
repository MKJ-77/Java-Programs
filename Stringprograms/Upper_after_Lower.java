package Stringprograms;
import java.util.*;
/**
 * Write a program to input a string in mixed case.
 * Arrange all the letters of the string such that all lower 
 * case letters are followed by uppercase letters.
    Sample input : ComputerScience
    Sample output : omputercienceCS
 */
public class Upper_after_Lower
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Word or a sentence with no spaces");
        String wrd = sc.next();
        int l= wrd.length();
        String Lc="" , Uc="" ;      
        for (int i=0;i<l;i++)
        {
            char ch= wrd.charAt(i);
            if  (ch>='a' && ch<='z')
                Lc+=ch;
            else if  (ch>='A' && ch<='Z')
                Uc+=ch;
        }
        System.out.println(Lc.concat(Uc));
    }
}
