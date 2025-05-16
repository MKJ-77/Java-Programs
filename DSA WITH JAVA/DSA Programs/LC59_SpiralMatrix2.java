public class LC59_SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] sp = new int[n][n];
        for (int i = 0, x = 1; x <= n * n; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                sp[i][j] = x;
                x++;
                if (x == n * n) return sp;
            }
            i++;
            // System.out.println(spiral);
            for (int j = 0 + i; j < n - i; j++) {
                sp[j][n - i] = x;
                x++;
                if (x == n * n) return sp;
            }
            // System.out.println(spiral);
            for (int j = n - i; j >= 0 + i; j--) {
                // System.out.println("Third");
                sp[n - i][j] = x;
                x++;
                if (x == n * n) return sp;
            }
            // System.out.println(spiral);
            for (int j = n - i; j >= 0 + i; j--) {
                sp[j][i - 1] = x;
                x++;
                if (x == n * n) return sp;
            }
        }
        // System.out.println(spiral);

        return sp;
    }

    public static void main(String[] args) {
        int[][] arr;
        LC59_SpiralMatrix2 ob = new LC59_SpiralMatrix2();
        arr = ob.generateMatrix(6);
        System.out.println();
        ob.display(arr);
    }

    private void display(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
