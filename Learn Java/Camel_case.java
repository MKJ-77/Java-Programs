public class Camel_case {
    public static void main(String[] args) {
        String s="saveChangesInTheEditor";
        
        int c=0;
        if(s.length()==0) c=0;
        else c=1;

        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                c++;
            }
        }
        System.out.println(c);
    }
}

