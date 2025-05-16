package Functions;
import java.util.*;
public class check_base_xy
{
    int x,y;
    public check_base_xy()
    {
        x=0;
        y=0;
    }

    public void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter x and y");
        x= sc.nextInt();
        y= sc.nextInt();
    }
    
    public void findbase()
    {
        
    }
    
    public int convert_base(int n , int b)
    {
        int d=0;
        for(int i=0;n!=0;i++)
        {
            d+=n%10*Math.pow(b,i);
        }
        return d;
    }
}
