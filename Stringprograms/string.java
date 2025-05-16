package Stringprograms; 
public class string
{
    public void main(String a , String b)
    {
        if (a==b)
        System.out.println("The characters entered by user are equal");
        else
        System.out.println("The characters entered by user are not equal");
        System.out.println("The Number of letters in upper case of fist String Variable: "+(total_upp_letter(a)));
        System.out.println("lower case letters to upper case of second String Variable: "+(b.toUpperCase()));
    } 
    public int total_upp_letter(String a)
    {
        int u=0;
        char d;
        for (int i=0, c=a.length();c!=0;i++,c--)
        {
            d=a.charAt(i);
            if (d>='A' && d<='Z')
            u++;
        } 
        return u;
    }
}
