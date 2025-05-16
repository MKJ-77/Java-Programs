import java.util.ArrayList;
import java.util.List;

public class mkj_SamGradingMarks {
    public static List<Integer> Grades;

    public static void setGrades() {
        Grades = new ArrayList<>();
        Grades.add(29);
        Grades.add(77);
        Grades.add(43);
        Grades.add(76);
        Grades.add(88);
        Grades.add(92);
        Grades.add(94);
        Grades.add(36);
        Grades.add(49);
        Grades.add(61);
        Grades.add(103);
        Grades.add(1003);
        Grades.add(100);
        Grades.add(38);
    }

    public static List<Integer> getGrades() {
        return Grades;
    }

    public static int roundIt(int num) {
        //for Storing the nearest num multiple of 5
        int n;
        // getting ten's place
        int div = num / 10;
        // getting unit's place
        int rem = num % 10;
        //this if-else used to get the nearest multiple of 5
        if (rem <= 5)
            n = div * 10 + 5;
        else
            n = div * 10+10;
        // condition satisfies multiple of 5 nearest to num is returned
        if ((n - num) < 3)
            return n;
        return num;
    }

    public static List<Integer> getResult(List<Integer> grades) {
        List<Integer> result = grades;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38)
                result.set(i, roundIt(grades.get(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        setGrades();
        System.out.println(getGrades());
        System.out.println(getResult(Grades));
    }
}
