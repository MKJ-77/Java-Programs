import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC390_Elimination_Game {
    public static void main(String[] args) {
//        List<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();
        LC390_Elimination_Game eg = new LC390_Elimination_Game();
        System.out.println(" Remaining : " + eg.lastRemaining(n));
//        for (int i = 1; i*2 <= n; i++) {
//            al.add(i*2);
//        }
//        System.out.println(al);
    }

    public int lastRemaining(int n) {
        if (n == 1) return 1;
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i * 2 <= n; i++) {
            al.add(i * 2);
        }
        al = find(al, 1);
        return al.getFirst();
    }
    public int lastRemaining2(int n) {
        if (n == 1) return 1;
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i * 2 <= n; i++) {
            al.add(i * 2);
        }
//        for(int i=0 ; ; )
        return 0;
    }

    public List<Integer> find(List<Integer> arr, int c) {
        int L = arr.size();
        System.out.println(arr);
        if (L == 1) return arr;
        if (c == 0) {
            for (int i = 0; i < arr.size(); i += 1) {
                arr.remove(i);
            }
            return find(arr, 1);
        } else {
            for (int i = L - 1; i >= 0; i -= 2) {
                arr.remove(i);
            }
            return find(arr, 0);
        }
    }
}
