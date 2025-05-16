import java.util.ArrayList;

public class mkj_DIagonalDiff {
    public static ArrayList<ArrayList<Integer>> arr;

    public mkj_DIagonalDiff() {
        arr = new ArrayList<>();
        // Initialize the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
    }

    public static void addElements() {
        arr.get(0).add(11);
        arr.get(1).add(2);
        arr.get(2).add(4);
        arr.get(0).add(4);
        arr.get(1).add(5);
        arr.get(2).add(6);
        arr.get(0).add(10);
        arr.get(1).add(8);
        arr.get(2).add(-12);
    }

    public static int FindDiff() {
        int ld = 0; // ld:Left diagonal sum
        int rd = 0; // ld:Right diagonal sum
        int diff; // for storing ld-rd
        int m = arr.size();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(j).get(i)+" ");
                if (i == j) {
                    ld += arr.get(j).get(i);
                }
                if (i + j == m-1) {
                    rd += arr.get(j).get(i);
                }
            }
            System.out.println();
        }
        diff = Math.abs(rd - ld);
        return diff;
    }

    public static void main(String[] args) {
        mkj_DIagonalDiff ob = new mkj_DIagonalDiff();
        addElements();
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(FindDiff());
    }
}
