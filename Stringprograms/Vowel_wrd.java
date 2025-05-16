package Stringprograms;
import java . util . * ;
/**
 * input a sentence and print the words starting with Vowels
 */
public class Vowel_wrd
{
    public void main ()
    {
        char a;int k=0;
        String s1="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Sentence ");
        String sen = sc.nextLine();
        System.out.println(" Words Starting with Vowel Are:");
        for (int i=0 ; i < sen.length() ; i++)
        {
            a= sen.charAt(i);
            s1=s1+a;
            if (a==' ' ||a==','|| a=='.' || a=='!' || a==';' || a=='?' || a==':')
            {
                char b=s1.charAt(0);
                if (b== 'a' ||b == 'e' ||b == 'i' ||b == 'o' ||b == 'u' ||b == 'A'||
                b == 'E' ||b == 'I' ||b == 'O' ||b == 'U'  )                     
                {
                    System.out.print(s1+"  ");
                }
                s1 = "" ;
            }
        }
    }
}
