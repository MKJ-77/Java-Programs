package Pyramid_Programs;
import java.lang.* ;
import java.util.* ;
public class Pattern
{
    public static void main(String[] args) {
        Pattern ob= new Pattern();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
        System.out.println("KONSA PATTERN BANANA HAI [1,2,3,4,5]");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1 :
                ob.ShowP1(n);
            break;
            case 2 :
                ob.ShowP2(n);
            break;
            case 3 :
                ob.ShowP3(n);
            break;
            case 4 :
                ob.ShowP4(n);
            break;
            case 5 :
                ob.ShowP5(n);
            break;
            default:
                System.out.println("ARRE DADA SAHI CHOICE DAALO");
            break;
        }
    }
    /** P1    |         
     *________|
     * 1      |             
     * 22     |         
     * 333    |         
     * 4444   |         
     * 55555  |                 
     *________|  */
    void ShowP1(int n)
    {
        for (int i =1;i<=n;i++)
        {
            for(int k=1 ;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println(); 
        }
    }

    /**    P2        |         
     *_______________|
     *1              |             
     *2 3            |         
     *4 5 6          |         
     *7 8 9 10       |        
     *11 12 13 14 15 |            
     *_______________|*/

    void ShowP2 (int n)
    {
        // for (int i=1 , j=1;i<=n;i++)
        // {
        // for (int k=1; k<=i ; k++ , j++)
        // {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++,k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    /**    P3        |        
     *_______________|
     *15 14 13 12 11 |             
     *10 9 8 7       |         
     *6 5 4          |         
     *3 2            |         
     *1              |                
     *_______________|*/
    void ShowP3(int n )
    {
        int sum = (n*(n+1))/2;
//        System.out.println(sum);
        for (int j=sum,i=n;i>=1;i--)
        {
            for (int k=1;k<=i;k++,j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /**   P4    |        
     *__________|
    | * * * * 5 |             
    | * * * 4 * |         
    | * * 3 * * |         
    | * 2 * * * |
    | 1 * * * * |         
    |___________|*/
    void ShowP4(int n)
    {
        for (int i=n; i>=1;i--)
        {
            for(int k=1;k<=n;k++)
            {
                if (k==i)
                    System.out.print(k+" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    
     /** P1     |         
     *__________|
     * 1        |             
     * 21       |         
     * 123      |         
     * 4321     |         
     * 12345    |
     * 654321   |
     * 1234567  |
     *__________|  */
    void ShowP5(int rows)
    {
        for(int i = 1; i<= rows; i++)
        {
            for(int k=1,j=i;k<=i;k++,j--)
            {
                if(i%2==0)
                    System.out.print(j);
                else
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}
