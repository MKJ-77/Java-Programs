package Numbers;

class Perfect_Number_1_to_n
{
    public void main(int n)
    {
        int i;
        System.out.println("Perfect Numbers Between 1-"+n);
        for(i=1;i<=n;i++)
        {
            int f=1,sof=0;
            while(f<=i-1)
            {
                if(i%f==0)
                    sof=sof+f;      
                f++;
            }
            if(sof==i)
                System.out.println(i);
        }
    }
}
