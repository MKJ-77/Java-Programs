import java.util.Scanner;

public class Diagonal_Sum {
    int[][] ar;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
    }

    void Display() {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int maxtrace() {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) sum = 
            }
        }
    }

    public static void main(String[] args) {

    }
}
