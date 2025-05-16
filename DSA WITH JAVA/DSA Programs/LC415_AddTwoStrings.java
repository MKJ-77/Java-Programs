import java.util.Scanner;

//Given two non-negative integers, num1 and num2 represented as string,
//return the sum of num1 and num2 as a string.
//You must solve the problem without using any built-in library
//for handling large integers (such as BigInteger).
//You must also not convert the inputs to integers directly.
//Example 1:
//Input: num1 = "11", num2 = "123"
//Output: "134"
public class LC415_AddTwoStrings {
    public String addStrings(String num1, String num2) {
        int i1 =num1.length()-1;
        int i2 =num2.length()-1;
        int carry=0;
        StringBuilder result= new StringBuilder();
        while (!(i1<0 && i2<0 && carry==0)) {
//          Setting digits to 0 for if place values of num1 and num2 not equal
            int d1=0,d2=0;
//            when No of digits is not equals for num1 and num2
//            if n1 is finished then if is skipped
            if(i1>-1){
                d1 = Integer.parseInt(num1.charAt(i1)+"");
                i1--;
            }
//            if n2 is finished then if is skipped
            if (i2>-1){
                d2 = Integer.parseInt(num2.charAt(i2)+"");
                i2--;
            }
            int sum=d1+d2+carry;
//            Finding Carry Over of digits
            carry= sum/10;
            sum=sum%10;
            result.insert(0, sum + "");
//            System.out.println(sum); -->printing sum to check the figure
//            System.out.println(carry); -->printing the carry over to check the figure
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        String n1=sc.next();
        String n2=sc.next();
        LC415_AddTwoStrings ob=new LC415_AddTwoStrings();
        System.out.println("Sum = "+ob.addStrings(n1,n2));
    }
}
