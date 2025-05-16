package Stringprograms;
import java . util.*;
public class Special_palindrome
{
    public void main()
    {
        Scanner sc = new Scanner (System.in);  
        System.out.println("Enter a Word ");
        String S = sc.next() ;
        int l=S.length()-1 ;
        int i=0 ,a=0,le=l;
        String str = "" ;
        while (i<l)
        {
            if (S.charAt(i) != S.charAt(l) )
            {
                if (S.charAt(0) == S.charAt(le))
                System.out.print ("The Input String Is  Not a Palindrome but It is a Special Word."); 
                else
                System.out.println(" The Input String Is  Neither a Palindrome Nor a Special Word.");
                i=0;
                break;
            }
            str = str + S.charAt(l) ;
            l--;
            i++;
        }
        if (i!=0)
        {
            System.out.println ("The Input String Is Special word and Palindrome"); 
        }
    }
}

