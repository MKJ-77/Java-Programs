package Stringprograms;
import java .util.*;
/**
 * Write a program to input a word in upper case and convert it into a PIGLATIN. A PIGLATIN word can be formed by taking all the characters in the word before the first vowel to the end and adding “AY” to it.
For eg. If the word is “BRAHMA” then piglatin is
AHMABRAY
If the word begins with a vowel then add AY in the end.
Example :    If the word is  ABHAY then its Piglatin will be
ABHAYAY
If the word has no vowel then it remains as it is.
 */
public class PIGLATIN
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the word");
        String Word= sc.nextLine(); 
        Word = Word.toUpperCase();
        int l = Word.length();
        char c;
        String wrd="" ,v="AIEOU", s1 = "";
        for (int i= 0; i<l; i++)
        {
            c = Word.charAt(i);
            if (v.indexOf(c)!=-1)
            {
                s1=Word.substring(Word.indexOf(c));
                break;
            }
            else if(v.indexOf(c)==-1)
                wrd = wrd + c;
        }
        s1= s1 + wrd + "AY" ;
        System.out.println("Piglatin Form of the ' "+ Word +" ' is : "+'\n'+s1) ;
    }
}