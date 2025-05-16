package Practical_Questions;
import java.util.*;
/**
 * Write a program to declare a matrix A[][] of order (M x N) where 'M' is the number of rows 
 * and 'N' is the number of columns such that the value of 'M' must be greater than 0 and less
 * than 10 and the value of 'N' must be greater than 2 and less than 6. Allow the user to input 
 * digits (0 - 7) only at each location, such that each row represents an octal number.

Example:
2   3   1   (decimal equivalent of 1st row = 153 i.e. 2x82 + 3x81 + 1x80)
4   0   5   (decimal equivalent of 2nd row = 261 i.e. 4x82 + 0x81 + 5x80)
1   5   6   (decimal equivalent of 3rd row = 110 i.e. 1x82 + 5x81 + 6x80)
Perform the following tasks on the matrix:
Display the original matrix.
Calculate the decimal equivalent for each row and display as per the format given below.
Test your program for the following data and some random data:

Example 1:
INPUT:
M = 1
N = 3
ENTER ELEMENTS FOR ROW 1: 1 4 4

OUTPUT:
FILLED MATRIX   DECIMAL EQUIVALENT
1   4   4       100

Example 2:
INPUT:
M = 3
N = 4
ENTER ELEMENTS FOR ROW 1: 1 1 3 7
ENTER ELEMENTS FOR ROW 2: 2 1 0 6
ENTER ELEMENTS FOR ROW 3: 0 2 4 5

OUTPUT:
FILLED MATRIX   DECIMAL EQUIVALENT
1   1   3   7   607
2   1   0   6   1094
0   2   4   5   165
*/
public class Row_Decimal_Eq
{
    int m,n,de;
    int Mat[][];
    static Scanner sc = new Scanner (System.in);
    public Row_Decimal_Eq(int rows, int coloumns)
    {
        m=rows;
        n=coloumns;
        de=0;
        Mat = new int [m][n];
    }

    public void GetMatrix()
    {        
        for(int i=0;i<m;i++)
        {
            System.out.print("ENTER THE ELEMENTS FOR ROW "+(i+1)+":");
            for(int j=0; j<n;j++)
            {
                Mat[i][j] = sc.nextInt();
                if(Mat[i][j]>7) 
                {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
            System.out.println("");
        }
    }
    public void Display()
    {
        System.out.println("FILLED MATRIX \t \t \t DECIMAL EQUIVALENT");
        for(int i=0;i<m;i++,de=0)
        {
            for(int p=n-1,j=0; j<n;j++,p--)
            {
                System.out.print(Mat[i][j]+" ");
                de+=Mat[i][j]* ((int)Math.pow(8,p))  ;
            }
            System.out.println("\t\t\t\t"+de);
        }
    }
    public static void main()
    {
        System.out.println("M (No. of Rows) = ");
        int m=sc.nextInt();
        System.out.println("N (No. of Coloumns)= ");
        int n=sc.nextInt();
        if(m<=0 || m>=10 || n<=2 || n>=6)
        {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        Row_Decimal_Eq ob = new Row_Decimal_Eq(m,n);
        ob.GetMatrix();
        ob.Display();        
    }
}