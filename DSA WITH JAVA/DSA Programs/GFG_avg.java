import java.util.Scanner;

public class GFG_avg
{
    String average(int A[], int N)
    {
        int sum=0;
        for(int i=0 ; i<N ; i++)
        {
            sum+=A[i];
        }
        return sum+" "+ String.format("%.2f",(sum*1.0/N)) ;
    }
    public static void main(String[] args) {
        int[] arr;
        GFG_avg ts= new GFG_avg();
        LC01_TwoSum SA =new LC01_TwoSum();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size Of ARRAY");
        int size=sc.nextInt();
        arr=SA.setArray(size);
//        int [] arr={1,2,3,4,5,6};
        System.out.println(ts.average(arr,size));
    }

}
