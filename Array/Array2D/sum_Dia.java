package Array.Array2D;
import java.util.*;
/**
 * Write a description of class sum_Dia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum_Dia
{
    int sumL=0; int sumR=0;
    int n=0; int a[][] ;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of a square matrix");
        n=sc.nextInt();
        System.out.print("enter the array elements");
        a= new int [n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

    }

    void sum_of_diagnols()
    {

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(i==j)    sumL+=a[i][j];
                if(i+j==n-1)    sumR+=a[i][j];
            }        
        }

    }

    void display()
    {
        System.out.print("SQUARE MATRIX "+"\n");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("sum of left diagnol:"+sumL); 
        System.out.println("sum of RIGHT diagnol:"+sumR); 

    }

    public static void main()
    {
        sum_Dia ob=new sum_Dia();
        ob.input();
        ob.sum_of_diagnols();
        ob.display();
    }
}

