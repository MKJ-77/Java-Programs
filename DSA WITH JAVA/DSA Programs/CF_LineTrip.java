import java.util.Scanner;

public class CF_LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int n = sc.nextInt();
            int target = sc.nextInt();
            int a = sc.nextInt();
            int diff = a;
            for(int j=1;j<=n;j++){
                if(j==n){
                    diff = Math.max((target-a)*2,diff);
                    break;
                }
                int b = sc.nextInt();
                diff = Math.max(Math.abs(a-b),diff);
                a=b;
            }
            System.out.println(diff);
        }
    }
}