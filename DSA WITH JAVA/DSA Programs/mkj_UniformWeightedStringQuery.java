import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mkj_UniformWeightedStringQuery {
    static String s;
    static List<Integer> queries;

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        s = sort(s.toLowerCase());
        ArrayList<Integer> weight = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            int j = s.lastIndexOf(ch) - s.indexOf(ch) + 1;
            int w1 = ch - 'a' + 1;
//            System.out.println(ch + " " + j);
            for (int k = 1; k <= j; k++) {
                int sw = k * w1; //Sum of Weighted possible String
//                System.out.println(sw);
                weight.add(sw);
            }
            i = s.lastIndexOf(ch) + 1;
        }
//        System.out.println(weight);
        ArrayList<String> QueryResult = new ArrayList<String>();
        for (int i = 0; i < queries.size(); i++) {
            if (weight.contains(queries.get(i))) QueryResult.add("Yes");
            else QueryResult.add("No");
        }
        return QueryResult;
    }

    static String sort(String s) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        s = "";
        for (int i = 0; i < s1.length; i++) {
            s += s1[i];
        }
        return s;
    }

    public void input() {
        s = "abbcccdddd";
        queries = new ArrayList<>();
        queries.add(1);
        queries.add(7);
        queries.add(5);
//        queries.add();
        queries.add(4);
        queries.add(15);
    }

    public static void main(String[] args) {
        mkj_UniformWeightedStringQuery ob = new mkj_UniformWeightedStringQuery();
        ob.input();
        List<String> Query;
        Query = ob.weightedUniformStrings(s, queries);
//        System.out.printlsn(queries);
        System.out.println(Query);
    }
}
