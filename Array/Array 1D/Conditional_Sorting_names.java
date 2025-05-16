package Array;
import java.util.*;
/**
 * Write a program to input an array and then sort the aray in such a way that the array is 
 * arranged in alphabetical Order and all the words starting with vowel are in the left and 
 * all the words Staring with consonent are in the right.
 * For Example-A[]={"mradul","Ali","Ayush","BHavesh","Eeshan","Keshav","Shaurya",
 *                  "umang","yuyutz","Aranya"};
 *   The output would be [Ali, Aranya, Ayush, Eeshan, umang, 
 *                        BHavesh, Keshav,mradul,Shaurya, yuyutz]               
 */
public class Conditional_Sorting_names
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        String [] nm= new String [10];
        String  vo="a e i o u A E I O U";
        System.out.println("Enter 10 Elements Of the Array");
        int i,j;
        //String nm [] = {"mradul","Ali","Ayush","BHavesh","Eeshan",
        //                "Keshav","Shaurya","umang","yuyutz","Aranya"};
        for(i=0;i<10;i++)
        {
            nm[i]=sc.next();
        }
        for ( i = 0; i < 10-1; i++)
        {
            for ( j = 0; j < 10-i-1; j++)
            {
                if (nm[j].compareToIgnoreCase(nm[j+1])>=1)
                {
                    String t = nm[j];
                    nm[j] = nm[j+1];
                    nm[j+1] = t;
                }
            }
        }
        System.out.println("In Alphabetical Order");
        System.out.println(Arrays.toString(nm));
        for ( i = 0; i < 10-1; i++)
        {
            for ( j = 0; j < 10-1; j++)
            {
                if (vo.indexOf(nm[j+1].charAt(0))>=1 && vo.indexOf(nm[j].charAt(0))==-1)
                {
                    String t = nm[j];
                    nm[j] = nm[j+1];
                    nm[j+1] = t;
                }
            }
        }
        System.out.println("After Conditional Sorting "+'\n'+Arrays.toString(nm));
    }
    public void P()
    {
        String  vo="a e i o u A E I O U";
        int i,j;
        String nm [] = {"mradul","Ali","Ayush","BHavesh","Eeshan",
                        "Keshav","Shaurya","umang","yuyutz","Aranya"};
        for ( i = 0; i < 10-1; i++)
        {
            for ( j = 0; j < 10-i-1; j++)
            {
                if (nm[j].compareToIgnoreCase(nm[j+1])>=1)
                {
                    String t = nm[j];
                    nm[j] = nm[j+1];
                    nm[j+1] = t;
                }
            }
        }
        System.out.println("In Alphabetical Order");
        System.out.println(Arrays.toString(nm));
        for ( i = 0; i < 10-1; i++)
        {
            if(vo.indexOf(nm[i].charAt(0))==-1)
            {
                for ( j = i+1; j < 10-1; j++)
                {
                    if(vo.indexOf(nm[j].charAt(0))>=1)
                    {
                        for(int k=j;k>i;k--)
                        {
                            String t=nm[k-1];
                            nm[k-1]=nm[k];
                            nm[k]=t;
                        }
                        break;
                    }   
                }
            }
        }
        System.out.println("After Conditional Sorting "+'\n'+Arrays.toString(nm));
    }
}