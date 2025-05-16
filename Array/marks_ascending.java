package Array;
import  java.util.*;
public class marks_ascending
{
    /**
     * Arranging Marks according to their rank   
     **/
    public void main()
    {      
        String tp,nm[]={"Mradul" , "Arnav" ,"Suukrat" ,  "Pranshu" ,  "Vaibhav"};
        Scanner sc=new  Scanner(System.in);
        Scanner ob=new  Scanner(System.in);
        int i,j,t,mk[]={89 , 78 , 92 , 94 , 88};
        for(i=0 ;i<5;i++)
        {
            for(j=0 ;j<4;j++)
            {
                if(mk[j]<mk[j+1])
                {
                    t=mk[j];
                    mk[j]=mk[j+1];
                    mk[j+1]=t;
                    tp=nm[j];
                    nm[j]=nm[j+1];
                    nm[j+1]=tp;
                }
            }
        }
        {
           for(i=0,j=1;i<5;j++,i++)
             System.out.println("Rank "+j+"  "+nm[i]+'\t'+mk[i]+"%");
        }
    }
}