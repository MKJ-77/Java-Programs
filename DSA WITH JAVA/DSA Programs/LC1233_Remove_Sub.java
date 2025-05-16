import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LC1233_Remove_Sub {
    public List<String> removeSubfolders(String[] folder) {
        List sub = new ArrayList<String>() ;
        for (int i = 0; i < folder.length ; i++) {
            sub.add(remove(folder[i]));
        }
        return sub;
    }
    public String remove(String st){
        String s=st ;
        while(s.lastIndexOf("/")!=0){
            s = st.substring(0,s.lastIndexOf("/"));
        }
        return s;
    }
    public static void main(String[] args) {
        ArrayList <String> arr= new ArrayList<>();
        LC1233_Remove_Sub ob =new LC1233_Remove_Sub();
        String [] fd = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(ob.removeSubfolders(fd));
    }
}
