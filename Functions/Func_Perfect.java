package Functions;
public class Func_Perfect
{
    public boolean Perfect(int n)
    {
        int f=1,sof=0;
        while(f<=n-1)
        {
            if(n%f==0)
            {
                sof=sof+f;
            }      
            f++;
        }

        if(sof==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
    public void main ()
    {
        System.out.println("Perfect Numbers Between 1-1000 are-:");
        for (int i=1;i<=1000;i++)
        {
            if (Perfect(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}
