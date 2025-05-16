import java.util.Arrays;

public class LC2707_remainingChar {
    public int minExtraChar(String s, String[] dict) {
        int n = s.length();
        int flag[]=new int[n];
        for(String st : dict){
            StringBuilder sb = new StringBuilder(s);
            n = st.length();
            while(sb.indexOf(st) != -1){
                int index = sb.indexOf(st);
                for(int i=0;i<n;i++){
                    flag[index+i] = 1;
                    sb.replace(index+i,index+i+1," ");
                    System.out.println(sb+" "+st+" "+(index+i)+" "+(index+n));
                }
            }
            System.out.println(Arrays.toString(flag));
        }
        n = s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(flag[i]==0) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        LC2707_remainingChar ob = new LC2707_remainingChar();
        String s = "eeqnzuq";
        String[] dict = {"e","x","yl","d","i","c","ee","mm","o","wb","mg","gu","zg","zu","a","rq","ti","lb","jh","er","rp","bk","w","uq","wa","t","n","uv","p","v"};
        int x = ob.minExtraChar(s,dict);
        System.out.println(x);
    }
}
