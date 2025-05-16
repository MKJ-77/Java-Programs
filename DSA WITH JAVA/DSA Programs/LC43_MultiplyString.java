public class LC43_MultiplyString {

    public String multiply(String n1, String n2) {
        int l1=n1.length()-1,l2=n2.length()-1;
        // StringBuilder p = new StringBuilder();
        String p="";
        int m1=0,m2=0,result=0,carry=0;
        for(int i=l1,j=l2 ; i>=0 || j>=0 ; m1 = 0 , m2 = 0){
            System.out.println("i = "+i+" j = "+j);
            if(i>=0){
                m1=Integer.parseInt(STR."\{n1.charAt(i)}");
                --i;
            }
            if(j>=0){
                m2=Integer.parseInt(STR."\{n2.charAt(i)}");
                --j;
            }
            int pro = (m1*m2);
            result = pro % 10 + carry;
            carry = pro / 10;
            p = result + p;
        }
        System.out.println(p);
        return p;
    }

    public static void main(String[] args) {
        LC43_MultiplyString ob = new LC43_MultiplyString();
        ob.multiply("1","2");
    }
}
