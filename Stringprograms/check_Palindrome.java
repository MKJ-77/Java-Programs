package Stringprograms;
import java.util.* ;
/**
 * TO check Palindrome of the String
 **/ 

public class check_Palindrome
{
    void main()
    {
        Scanner sc = new Scanner (System.in);  
        System.out.println("Enter a Word ");
        String S = sc.next() ;
        int l=S.length()-1 ;
        int i=0 ;
        String str = "" ;
        while (i<l)
        {
            if (S.charAt(i) != S.charAt(l))
            {
                System.out.println ("The Input String Is Not Palindrome"); 
                i=0; 
                break;
            }
            str = str + S.charAt(l) ;
            l--;
            i++;
        }
        if (i!=0)
        System.out.println ("The Input String Is Palindrome"); 
    }
}
