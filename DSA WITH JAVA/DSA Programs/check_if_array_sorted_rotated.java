import java.util.Arrays;

public class check_if_array_sorted_rotated {
    static int[] num;
    public boolean check(int[] nums) {

        int max=nums[0];
        int x=0;

        int [] arr = Sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(nums[0]==arr[i]) {
                x=i;
                break;
            }
        }
        for(int i=0 ;i<=nums.length-1;i++){
            System.out.println(arr[x] +" "+nums[i]);
            if(arr[x]==nums[i]){
                x++;
                if(x==arr.length){
                    x=0;
                }
            }
            else return false;
        }
        return true;
    }

    public void input(int l){
        switch (l){
            case 4:
                num= new int[]{2, 1, 3, 4};
                break;
            case 5:
                num= new int[]{3,4,5,1,2};
                break;
        }
    }

    public int[] Sort(int [] nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }
        return nums;
    }

    public void Display(int [] nums){
        for (int ele : nums) {
            System.out.print(ele);
        }
    }

    public static void main(String[] args) {
        check_if_array_sorted_rotated ob = new check_if_array_sorted_rotated();
        ob.input(4);
        System.out.println(ob.check(num));
    }
}
