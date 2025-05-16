import java.util.Scanner;

public class mkj_Kangaroo_SamePos {
    static int x1, x2;// Initial position of Kangaroos
    static int v1, v2;// Velocity of KangaroosS

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("x1 : ");
        int x1 = sc.nextInt();
        System.out.println("v1 : ");
        int v1 = sc.nextInt();
        System.out.println("x2 : ");
        int x2 = sc.nextInt();
        System.out.println("v2 : ");
        int v2 = sc.nextInt();
    }

    public static boolean kangaroo() {
        int x = x1 - x2, v = v2 - v1;
        if (x * v > 0 && x % v == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        input();
        if (kangaroo())
            System.out.println("yes".toUpperCase());
        else
            System.out.println("NO");
    }
}


