package Stringprograms;
/**
 * Write a description of class name_initials here.
 * Input the full name and return the initials
 */
public class name_initials
{
    public void main(String Full_name)
    {
        String n = Full_name ;
        System.out.println("Full Name : "+n);
        char c=n.charAt(0);
        String s1="" , ini ="";
        int l = n.length();
        for (int i=0 ;i<l ;i++)
        {
            c =n.charAt(i);
            s1= s1 + c;
            if (c == ' ')
            {
                c=s1.charAt(0);
                ini=ini+ c+". ";
                s1 = "";
            }
        } 
        ini = ini + s1 ;
        System.out.println("Initials : "+ ini);
    }
}