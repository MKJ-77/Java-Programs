package Stringprograms;
import java. util. *;
/**
 * Given a string str, write a Java program to print all  
       words with even length in the given string
Input:  "This is a java language“
 Output : This is java language.
 */
public class Print_Words_With_Even_Length
{
    public void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input A Sentence");
        String s= sc.nextLine(), s1="";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens())
        {
            String wrd = st.nextToken();
            if (wrd.length()%2==0)
            s1+=wrd+" ";
        }
        System.out.println(s1);
    }
}