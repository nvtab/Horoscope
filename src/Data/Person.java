
package Data;

import java.time.LocalDate;

import Business.InventingHoroscope;

public class Person {
    public String name;
    public LocalDate birthday;
    public ZodiacSign sign;
    
    public Person(String name, LocalDate bornIn){
        this.name=name;
        this.birthday=bornIn;
        this.sign=InventingHoroscope.whichSignIAm(bornIn);
    }
    
    public void setZodiacSign(ZodiacSign a){
       this.sign=a; 
    }
}
