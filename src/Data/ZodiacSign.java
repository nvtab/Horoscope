package Data;

import java.time.LocalDate;
import java.time.Month;

public class ZodiacSign {
    public LocalDate startDate;
    public LocalDate endDate;
    public String name;
    
    
    public ZodiacSign(int firstDay, int firstMonth, int lastDay, int lastMonth, String name){
        this.startDate=LocalDate.of(0, firstMonth, firstDay);
        this.endDate=LocalDate.of(0, lastMonth, lastDay);
        this.name=name;
    }
}
