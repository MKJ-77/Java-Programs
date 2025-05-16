import java.util.StringTokenizer;

public class LC2490_CircularSentence {
    public boolean isCircularSentence(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence);
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;
        int length = st.countTokens();
        String prev = st.nextToken();
        for (int i = 1; i < length; i++) {
            String next = st.nextToken();
            System.out.println(prev + " " + next);
            if (prev.charAt(prev.length() - 1) != next.charAt(0)) {
                return false;
            }
            prev = next;
        }
        return true;
    }

    public static void main(String[] args) {
        String sen="";
        LC2490_CircularSentence ob = new LC2490_CircularSentence();
        System.out.println(ob.isCircularSentence(sen));
    }
}
