import java.util.ArrayList;
import java.util.List;

public class mkj_Choco_Div {
    public static List<Integer> score;
    public static int m ,d;
    public void input() {
        score = new ArrayList<>();
        score.add(2);
        score.add(2);
        score.add(1);
        score.add(3);
        score.add(2);
        m=2;
        d=4;
//        score.add(20);
//        score.add(4);
//        score.add(5);
//        score.add(25);
    }

    public static int Findsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        9819085344
        System.out.println("sum : " + sum);
        return sum;
    }

    public static int birthday(List<Integer> s) {
        // Write your code here
        int[] choices = new int[m];
        int di = d;
        int mi = m;
        int ways = 0;
        for (int i = 0, x = 0; i < s.size(); i++, x = 0) {
            x = score.get(i);// counter
            if (score.size() - mi < i)
                break;
            for (int j = i + 1, pair = 2; pair <= mi && j < s.size(); j++) {
                x += score.get(j);
                pair++;
            }
            System.out.println(x);
            if (x == di)
                ways++;
        }
        return ways;
    }

    public static void main(String[] args) {
        mkj_Choco_Div ob = new mkj_Choco_Div();
        ob.input();
        System.out.println("ANSWER " + ob.birthday(score));

    }
}
