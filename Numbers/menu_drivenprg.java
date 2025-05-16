package Numbers;

import java.util.*;
/**
 * class 10th paper 2019 q5.
 */
public class menu_drivenprg
{   
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("1: to generate and print letters form A-Z and print unicode with them");
        System.out.println("2: pattern");
        System.out.println("Enter your choice '1'/'2'");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
            int b=65;
            for(char a='A' ;a<='Z';a++,b++)
            {
                System.out.print(a+'\t'+'\t');
                System.out.println(b);
            }
            break;
            case 2:
            for (int i=1;i<=5;i++)
            {
                for (int k=1;k<=i;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}
