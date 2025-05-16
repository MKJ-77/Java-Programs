package Array;
import java.util.*; 
public class Seven_Wonders
{
    /**
     * Write a program to initialize the seven Wonders of the World along 
     * with their locations in different arrays. Search for a name of the country 
     * input by the user. 
     * If found, display the name of the country along with its Wonder, 
     * otherwise 
     * display “Sorry Not Found”.
     * Seven Wonders -"CHICHEN ITZA, CHRIST THE REDEEMER, TAJ MAHAL,
     *                GREAT WALL OF CHINA,MACHU PICCHU, PETRA, COLOSSEUM
     *                Locations –MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY
     * Example – 
     * Country Name : INDIA
     * Output : INDIA - TAJ MAHAL
     * Country Name : USA
     * Output : Sorry Not Found
     **/
    public void main()
    { 
        Scanner sc = new Scanner (System.in);  
        String SW[]={"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJ MAHAL",
                "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String CN[]={"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        System.out.println("Enter The Name Of The Country :");
        String C=sc.nextLine();int i,f=0;
        for(i=0;i<=6;i++) 
        {
            if(C.equalsIgnoreCase(CN[i]))
            {
                System.out.println(CN[i]+" - "+SW[i]);
                f++;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Sorry Not Found");
        }
    }
}
