import java.util.Scanner;

public class LC09_Pal {
    public boolean isPalindrome(int x) {
    String n=x+"";
    if(x>=0){
        /*the following code takes runtime upto 8ms */
        //    StringBuffer sb=new StringBuffer(n);
        //    if(sb.reverse().toString().equals(n))
        //    return true;
        //    else
        //    return false;
        /* the following program takes runtime upto 6ms */
        int start=0,end=n.length()-1;
        while(start<=end)
        {
            if(n.charAt(start)!=(n.charAt(end)))
                return false;
            start++;end--;
        }
        return true;
    }
    else return false;
}

    public static void main(String[] args) {
        System.out.println("Enter A number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        LC09_Pal ob=new LC09_Pal();
        if(ob.isPalindrome(num)){
            System.out.println("TRUE");
        }
        else
            System.out.println("FAlSE");
    }
}
