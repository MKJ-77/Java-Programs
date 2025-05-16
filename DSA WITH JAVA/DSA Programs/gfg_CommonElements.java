import java.util.*;
public class gfg_CommonElements {

    public static void main(String[] args) {
        LC01_TwoSum ts= new LC01_TwoSum();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of Array 1");
        int l1=sc.nextInt();
        System.out.println("Enter Elements of Array 1");
        int[] v1 =ts.setArray(l1);
        System.out.println("Enter the size of Array 2");
        int l2=sc.nextInt();
        System.out.println("Enter Elements of Array 2");
        int[] v2 =ts.setArray(l2);
        System.out.println("Array 1 : "+ Arrays.toString(v1));
        System.out.println("Array 2 : "+ Arrays.toString(v2));
        System.out.println("Common elements of both array.\n"+ (common_element(v1, v2)));
    }
    public static ArrayList<Integer> common_element(int[] v1, int[] v2)
    {
//        Sorting Both the Arrays
        Arrays.sort(v1);
        Arrays.sort(v2);
//        no of elements in both the arrays
        int l1=v1.length;
        int l2=v2.length;
//        declaring of Array list of object name 'ce'
        ArrayList<Integer> ce = new ArrayList<>();
        for(int i=0 , j=0 ; i<l1 && j<l2 ;)
        {
            if(v1[i]==v2[j])
            {
                ce.add(v1[i]); //add() is used by array list to add number
                i++;j++;
            }
            else if (v1[i]>v2[j]) j++;
            else i++;
        }
        return ce;
    }
}

