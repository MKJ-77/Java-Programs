import java.text.DecimalFormat;

public class mkj_timeConversion_24_format {
    public static String Time;

    static void setTime() {
        Time = "06:00:59PM";
    }

    public static String formatTime(String s) {
        int min, hrs, sec;
        String day = s.substring(s.length() - 2);
        hrs = Integer.parseInt(s.substring(0, 2));
        min = Integer.parseInt(s.substring(3, 5));
        sec = Integer.parseInt(s.substring(6, 8));
        if (day.equalsIgnoreCase("pm")) {
            if(hrs!=12)
                hrs += 12;
        }
        else{
            if (hrs==12)
                hrs = 0;
        }
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hrs)+":"+df.format(min)+":"+df.format(sec);
    }

    public static void main(String[] args) {
        setTime();
        System.out.println("Time in AM/PM: " + Time);
        System.out.println("Time in 24 hr: "+formatTime(Time));
    }
}
