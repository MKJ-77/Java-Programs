package Array;
import java.util.*; 
public class insert_ele_in_position_byuser
{ 
    /**
     * Create an array of size 10 then accept 9 numbers into it. Then accept another number and its position where you want to insert it. 
     * Insert the given number in given position then Display the array.
     */
    public void main()
    {
        int A[] = new int[10];
        int i,j;
        //int A[]={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner (System.in);
        for(i=0;i<9;i++)
        {
            System.out.println("Enter the Element of Array A.");
            A[i]=sc.nextInt();
        }
        System.out.println("Enter last element in Array A.");
        int n=sc.nextInt();
        System.out.println(" Enter the index of the last Element, between 0-9");
        i=sc.nextInt();
        for(j=8;j==i;j--)
        {
            A[j+1]=A[j];
        }
        A[i]=n;
        System.out.println(" the Elements of Array A.:");
        System.out.println(Arrays.toString(A));
    } 
}