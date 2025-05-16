package Numbers;

import java.util.*;
/**
 * Write a Java program to check whether a number is a Duck Number or not. 
 * Note: A Duck number is a number which has zeroes present in it, 
 * but there should be no zero present in the beginning of the number. 
 * For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not
 */
public class Duck_Number
{
    
    public void main ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter A Number");
        String num = sc . next();
        if (Is_DuckNumber(num) == true)   
        System.out.println(num + " Is A Duck Number ");
        else
        System.out.println(num + " Is Not A Duck Number ");
    }
    
    public boolean Is_DuckNumber(String n)
    {
        
        if (n.startsWith("0") || n.endsWith("0"))
        return false;
        else 
        return true;
    }
}
