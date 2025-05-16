package Stringprograms;
import java.util.*;
public class change_case
{
    static void convertOpposite( StringBuffer str)
    {
        String sen="";
        int i,l=str.length();
        for ( i=0; i<l; i++) 
        { 
            char a = str.charAt(i); 
            if (Character.isLowerCase(a)) 
            {
                str.replace(i, i+1, Character.toUpperCase(a)+""); 
            }
            else
            {
                str.replace(i, i+1, Character.toLowerCase(a)+"");              
            }
        }
    }
    
 
    public static void main(String[] args)
    { 
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Word in Both Upper and lower cases");
         String st = sc.next();
         StringBuffer str = new StringBuffer(st); 
         // Calling the Method 
         convertOpposite(str); 
           
         System.out.println(str); 
    } 
}