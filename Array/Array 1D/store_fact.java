package Array;
public class store_fact
{    
    public void main()
    {
        int i,j,fact=1,n[]=new int[10];
        for(i=0;i<=9;i++)
        {
            fact=1;
            for(j=1;j<=1+i;j++)
            {
                fact*=j;
            }
            n[i]=fact;
        }
        for(i=0;i<=9;i++)
        {
            System.out.println(n[i]);
        }
    }
}