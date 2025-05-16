package Stringprograms;
import java. util.*;
/**
 * Write a program to input a sentence in UPPERCASE.
 * and print Longest palindrome words present in it. 
 * Example : INPUT : MADAM SPEAKS MALAYALAM DAD AND MOM SPEAK HINDI
 * OUTPUT :  MALAYALAM  9
 
 */
public class Longest_Pallindrome_word
{
    public void main(String sen)
    {
        sen= sen.toUpperCase();int l=0;String s1="";
        StringTokenizer st= new StringTokenizer(sen);
        while(st.hasMoreTokens())
        {
            String wrd = st.nextToken(); 
            if (check_Palindrome (wrd)== true)
            {
                int l2=wrd.length();
                if (l<l2)
                {
                    l=l2;
                    s1=wrd;
                }
            }
        }
        System.out.println(s1 +" "+ l);
    }
    boolean check_Palindrome (String s)
    {
            StringBuffer st= new StringBuffer(s);
            if(st.reverse().toString().equals(s))
            return true;
            else
            return false;
    }
}/*                                 By Sir Solution
class PalindromeWords
{
   
   static void main(String str)
   {
       PalindromeWords obj = new PalindromeWords();
       str = str.toUpperCase();
       StringTokenizer st = new StringTokenizer(str);
       int l = st.countTokens(),l1=0;
       String s2="",wd1="";
       for(int i = 1 ; i<=l ; i++)
       {
           String wd = st.nextToken();
           StringBuffer sb = new StringBuffer(wd);
           wd1 = sb.reverse().toString();
           
           if(wd.equals(wd1))
           {
               if(s2.length()<wd.length())
               {
                  s2 = wd;l1 = s2.length();
                }
                   
            }
        }
        System.out.println(s2 + " "+l1);
    }
}


*/