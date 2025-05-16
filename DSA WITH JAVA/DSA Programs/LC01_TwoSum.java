import java.util.*;

public class LC01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={0,0};
        for(int i=0; i<nums.length ;i++)
        {
            ans[0]=i;
            for(int j=0;j<nums.length ;j++)
            {
                if(i==j) continue;
                ans[1]=j;
                if((nums[i]+nums[j])==target) return ans;
            }
        }
        return ans;
    }

    public int[] setArray(int size) {
        Scanner sc=new Scanner (System.in);
        int [] arr= new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter "+(i+1)+" Element :");
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr;
        LC01_TwoSum ts= new LC01_TwoSum();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size Of ARRAY");
        int size=sc.nextInt();
        arr=ts.setArray(size);
        System.out.println("Enter Sum of 2 Numbers in Array to be Searched ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(ts.twoSum(arr,target)));
    }
}

