package Stringprograms;
import java.util.*;
/**write a program to input a word through scanner class  and display
 * the word after removing the vowels and finally arrange the new word
 * in alphabetical order
**/
public class arrange_with_no_vowel 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WORD BATAO");
        String wrd=sc.next();
        arrange_with_no_vowel ob = new arrange_with_no_vowel ();
        wrd=wrd.toUpperCase();
        String s1= ob.remove_vowels(wrd);
        String s2= ob.arrange(s1);
        System.out.println("Word with no vowel : "+ s1);
        System.out.println("Word in Alphabetical Order :"+s2);
    }
    
    String arrange(String wrd)
    {
        String s2="", vo="A E I O U ";
        char[] vowels= vo.toCharArray();
        int L= wrd.length();
        for (char ch='B' ;ch <= 'Z';ch++)
        {
            for (int I=0; I<L ;I++)
            {
                char chq = wrd.charAt(I);
                String c = chq+" ";
                if(chq == ch)
                {
                    s2= s2 + chq;
                }
            }
        }
        return s2;
    }
    
    String remove_vowels(String wrd)
    {
        int L= wrd.length();
        String s = "" ;
        for (int I=0; I<L ;I++)
        {
            char ch = wrd.charAt(I);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
            s = s + ch;              
        }
        return s;
    }
}