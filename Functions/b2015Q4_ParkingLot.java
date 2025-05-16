package Functions;
import java.util.*;
/**-------------------------------------------------------------|
 * Board paper 2015 Q4                                         
 * define a Class Parkinglot 
 * Data Members / Instance Variables
Int vno     - to store vehicle Number
Int hours   - to store the number of hours the vehicle is 
parked in the parking lot   
Double bill - to store the bill ammount 
 *Member methods:
void input()- to input and store the vno and hours
void calculate()- to compute the parking charge at the rate of 
Rs. 3 for the first hour and Rs.1.5 for each
additional hour.
void display ()- To display the detail
 *Write a main method to create an object of the class and call
above methods*
_______________________________________________________________|  
 */
public class b2015Q4_ParkingLot
{
    int vno;
    int hours;
    double bill;
    public b2015Q4_ParkingLot(int vno,int hours)
    {
        this.vno=vno;
        this.hours=hours;
        this.bill=0.0;
    }

    /*void input()
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the vehicle Number");
    vno= sc.nextInt();
    System.out.println("Enter the time the vehicle was parked in hours");
    hours = sc.nextInt();
    }*/
    void calculate()
    {
        bill= 3.0;
        if (hours >=1)
        {
            bill= ((hours-1)*1.5)+ 3.0;
        }
    }

    void display()
    {
        System.out.println("Vehicle Number : "+ vno);
        System.out.println("Time parked in parking : "+hours);
        System.out.println("Bill Amount : "+bill);
    }

    void main()
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the vehicle Number");
        vno= sc.nextInt();
        System.out.println("Enter the time the vehicle was parked in hours");
        hours = sc.nextInt();       
        b2015Q4_ParkingLot ob = new b2015Q4_ParkingLot (vno,hours);
        //ob.input();
        ob.calculate();
        ob.display();
    }
}
