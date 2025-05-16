package Numbers;

import java.util.*;
/****************************************************************************
                 *Using the Switch statement, write a menu driven program for the following *
    FLOYD'S TRIANGLE    |          Printing Letters                  
____________________________________________________________ 
1                       |I                                 |
                        |                                  |
2 3                     |I C                               |
                        |                                  |               
4 5 6                   |I C S                             |
                        |                                  |
7 8 9 10                |I C S E                           |
                        |__________________________________|                                  |    
11 12 13 14 15          |                                  
________________________|
                       *FOR WRONG CHOICE  APPROPRIATE MESSAGE SHOULD BE DISPLYED* 
*/
class Board2016_q6$
{
    public void main ()
    {
        int f=1,i ,k;
        Scanner sc = new Scanner (System.in) ; 
        System.out.println( " Input '1' for Floyd's Triangle  " );
        System.out.println( " Input '2' for Printing 'ICSE'  " );
        System.out.println( " Input '1' or '2'  " );
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
            for (i=1 ; i<=15 ; i++)
            {
                for ( k=1 ; k<=i ; k++ , f++ )
                {
                    System.out.print(f+" ");
                }
                System.out.println('\n');
            }
            break;
            case 2:
            String s= "ICSE";
            for ( i=1 ; i<=4 ; i++)
            {
                for ( k=1 ; k<=i ; k++ , f++ )
                {
                    System.out.print(s.charAt(k)+" " );
                }
                System.out.println('\n');
            }
            break;
            default:
            System.out.println("PLEASE INPUT (enter) '1' or '2' ");
        }   
    }
}
