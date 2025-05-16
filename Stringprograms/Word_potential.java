package Stringprograms;
import java.util.*;
/**
 * Potential of a string can be found by adding the ASCII 
 * value of each character present in the string. 
 * Write a program to input a sentence and print the 
 * potential of each word present in it in separate line. 
 * Sample Input : He is a Good Boy
 * Sample output :
        He      173
        is      220
        a       97
        Good    393
        Boy     298
 */
public class Word_potential
{
    public void main(String sentence)
    {
        String sen = sentence;
        StringTokenizer st = new StringTokenizer (sen);
        while (st.hasMoreTokens())
        {
            String wd= st.nextToken();
            int l= wd.length()-1;
            int sum = 0;
            for (int i=0;i<=l;i++)
            {
                char ch = wd.charAt(i);
                sum += ch;
            }   
            System.out.println(wd+'\t'+sum);
        }
    }
}