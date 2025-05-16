import java.util.*;
public class pronounce {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        for(int i=0 ; i < tc; i++){
            int n = sc.nextInt();
            String s = sc.next();
            String vowel = "aeiou";
            int c = 1;
            if(n>3){
                int max = 0 ;
                for(int j=0,x=0; j < n; j++){
                    char ch = s.charAt(j);
                    if(vowel.indexOf(ch) >= 0){
                        max = Math.max(max,x);
                        x=0;
                    }
                    x++;
                }
                c = max>3?0:1;
            }
            if(c==0){
                System.out.println("NO");
                continue;
            }
            System.out.println("Yes");
        }

    }
}
