package Stringprograms;


/**
 * Write  a program to accept a String. Remove duplicate characters from the String so
 * that there is only one instance of that character in the given String.
 * Eg Input Committee 
 *    Output COMITE  
 */
public class Remove_Duplicate
{
    public void main(String wrd)
    {
        int l= wrd.length()-1;
        wrd=wrd.toUpperCase();
        String s="";
        for (int i=0;i<l;i++)
        {
            char ch=wrd.charAt(i);  
            if ( s.indexOf(ch)==-1)
                {
                    s=s+ch;
                }
        }
        System.out.println("New String : "+s);
    }   
}
