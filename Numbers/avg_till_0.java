package Numbers;

import java.util.*;
class avg_till_0
{
public void main()
{
    int n,s=0,count=1;
    double avg=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NO.");
    n=sc.nextInt();
    while(n!=0)
    {    
    s=s+n;
    n=sc.nextInt();
    avg =s/count;
    count++;
    }
    System.out.println("Average="+avg);
}
}







