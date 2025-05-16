import javax.xml.transform.Source;
import java.sql.SQLOutput;
import  java.util.*;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Temp : ");
        double temp = sc.nextDouble();
        System.out.println("Temp in  Far. : "+ ((9*temp)/5+32));
    }
}
