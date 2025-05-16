package Numbers;

class Special_Number
{
    public void main_(int n)
    {
        int s=0;
        for (int n1=n;n1!=0;n1/=10)
        {
            int a=n1%10,f=1;
            for(int i=1;i<=a;i++)
            {
                f=f*i;
                
            }
            s=f+s;    
        }
        if(s==n)
        {
            System.out.println(n+" is a Special Number");
        }
        else
        {
            System.out.println(n+" is not a Special Number");
        }            
    }
}