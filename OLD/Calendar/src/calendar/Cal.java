
package calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cal {
    
    public static void printMonth(int Year, int Month){
        
        Calendar c = Calendar.getInstance();
        c.set(Year, Month-1, 1);
        int firstDay = c.get(Calendar.DAY_OF_WEEK);
        int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int nextDay = c.get(Calendar.DAY_OF_WEEK);
        int n=0;
        
        System.out.println(monthName(Month));
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        String probel = "   ";
        
        for(int i=1;i<firstDay;i++){ System.out.print("    "); n++;};
        for(int i=1;i<=lastDay;i++){
            if(i>9) probel = "  ";
            System.out.print(i + probel);
            c.add(Calendar.DATE, 1);
            n++;
            if(n%7==0){System.out.println("");};
        }
        
        
        System.out.println("\n");
    }
    
    public static void printMonth(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        
        printMonth(year, month);
    }
    
    private static String monthName(int Month){
        if(Month == 1) return   ("                    January"); else
        if(Month == 2) return   ("                   February"); else
        if(Month == 3) return   ("                      March"); else
        if(Month == 4) return   ("                      April"); else
        if(Month == 5) return   ("                        May"); else
        if(Month == 6) return   ("                       June"); else
        if(Month == 7) return   ("                       July"); else
        if(Month == 8) return   ("                     August"); else
        if(Month == 9) return   ( "                 September"); else
        if(Month == 10) return  ("                    October"); else    
        if(Month == 11) return  ("                   November"); else    
        if(Month == 12) return  ("                   December"); else    
        return("none");
    } 
    
    public static void printCalendar(int Year){
        
        System.out.println("Calendar for " + Year + " year!\n");
        
        for(int i=1;i<=12;i++){
            printMonth(Year, i);
        }
    }
    
}
