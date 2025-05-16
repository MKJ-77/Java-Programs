import java.util.Arrays;
import java.util.HashSet;

public class LC73_MatrixZero {
    public void setZeroes(int[][] mat) {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> cols = new HashSet<Integer>();
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] ar = {{1,1,1},{1,0,1},{1,1,1}};
        LC73_MatrixZero ob = new LC73_MatrixZero();
        ob.display(ar);
        ob.setZeroes(ar);
        ob.display(ar);
    }
    void display(int [][]mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
