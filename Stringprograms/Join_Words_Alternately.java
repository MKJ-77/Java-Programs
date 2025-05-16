package Stringprograms;
import java.util.*;
/**Write a program to accept two strings. 
 * Display the new string by taking each character of first string 
   from left to right and of the second string from right to left,
   The letters should be taken alternately from each string.
 * Assume that the length of both the strings is same.
Sample input : String 1: HISTORY
               String 2: SCIENCE
Sample Output : HEICSNTEOIRCYS
 */
public class Join_Words_Alternately
{
    public void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 words of Same Length");
        String wrd1=sc.next();
        String wrd2=sc.next();
        int l= wrd1.length();
        int L=l-1;
        String wrd="";
        char ch1,ch2;
        if (l==wrd2.length())
        {
            for (int i=0 ; i<l ; i++,L-- )
            {
                ch1 = wrd1.charAt(i);
                ch2 = wrd2.charAt(L);
                wrd = wrd + ch1 + ch2 ;
            }
            System.out.println("New Word : "+wrd);
        }
        else 
        {
            System.out.println("Words aren't of same Length");
        }
    }
}
