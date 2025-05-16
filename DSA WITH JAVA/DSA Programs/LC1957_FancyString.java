public class LC1957_FancyString {
        public String makeFancyString(String s) {
            if(s.length()<3)
                return s;
            String s1="";
            int n=s.length();
            int c=0;
            for(int i=1;i < n-1;){
                char prev = s.charAt(i-1);
                char curr = s.charAt(i);
                char next = s.charAt(i+1);
                if(prev == curr && curr ==next){
                    s1+=curr ;
                    i+=2;
                    c=1;
//                }else if(prev == curr){
//                    s1+=prev;i+=2;c=1;
                }else{
                    s1+=prev;
                    i+=2;
                    c=0;
                }
                if(c==0) s1+=curr;
                System.out.println(s1);
            }
            return s1;
        }

    public static void main(String[] args) {
        LC1957_FancyString ob= new LC1957_FancyString();
        ob.makeFancyString("Leeeetcode");
    }
}
