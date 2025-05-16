import java.util.ArrayList;
import java.util.List;

public class mkj_ScoreMax {
    public static List<Integer> score;

    public void input() {
        score = new ArrayList<>();
        score.add(10);
        score.add(5);
        score.add(20);
        score.add(20);
        score.add(4);
        score.add(5);
        score.add(2);
        score.add(25);
        score.add(1);
    }

    public static void FindRecord() {
        int maxC = 0, minC = 0;
        int max = score.get(0), min = max;
        for (int i = 1; i < score.size(); i++) {
            if (score.get(i) > max) {
                maxC++;
                max = score.get(i);
            } else if (score.get(i) < min) {
                min = score.get(i);
                minC++;
            }
        }
        System.out.println("max : " + maxC);
        System.out.println("min : " + minC);
    }

    public static void main(String[] args) {
        mkj_ScoreMax ob = new mkj_ScoreMax();
        ob.input();
        ob.FindRecord();
    }
}
