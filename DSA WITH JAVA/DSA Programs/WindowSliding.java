import java.util.Scanner;

public class WindowSliding {
    void windowKholo(int []arr , int maxi){
        int l=0,r=0,length = arr.length,maxlength=0,sum=0;
        while(l<=length){
            sum = sum+arr[r];
            while(sum>maxi){
                sum = sum - arr[l];
                l--;
            }
            if(sum<maxi){
                maxlength = l-r+1>maxlength ? l-r+1 : maxlength ;
            }
            r++;
        }
        System.out.println(maxlength);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        WindowSliding khidki = new WindowSliding();
        khidki.windowKholo(arr,10);
    }
}
