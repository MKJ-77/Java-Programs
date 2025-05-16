import java.util.Scanner;

public class Pattern_Types {
    int rows;
    Pattern_Types(int rows)
    {
        this.rows=rows;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows =sc.nextInt();
        Pattern_Types HalfPyramids =new Pattern_Types(rows);
        HalfPyramids.Inverted_Triangle();
    }
//    ___*
//    __**
//    _***
//    ****
    public void Inverted_Triangle(){
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {
                if(j>rows-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
