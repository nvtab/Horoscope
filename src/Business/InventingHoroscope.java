
package Business;

import java.util.HashMap;
import java.time.LocalDate;
import Data.Person;
import Data.ZodiacSign;


public class InventingHoroscope {
    
    public static ZodiacSign aries=new ZodiacSign(21, 3, 20, 4, "Aries");
    public static ZodiacSign tauro=new ZodiacSign(21, 4, 20, 5, "Tauro");
    public static ZodiacSign geminis=new ZodiacSign(21, 5, 21, 6, "Geminis");
    public static ZodiacSign cancer=new ZodiacSign(22, 6, 22, 7, "Cancer");
    public static ZodiacSign leo=new ZodiacSign(23, 7, 23, 8, "Leo");
    public static ZodiacSign virgo=new ZodiacSign(24, 8, 23, 9, "Virgo");
    public static ZodiacSign libra=new ZodiacSign(24, 9, 22, 10, "Libra");
    public static ZodiacSign escorpio=new ZodiacSign(23, 10, 22, 11, "Escorpio");
    public static ZodiacSign sagitario=new ZodiacSign(23, 11, 21, 12, "Sagitario");
    public static ZodiacSign capricornio=new ZodiacSign(22, 12, 19, 1, "Capricornio");
    public static ZodiacSign acuario=new ZodiacSign(20, 1, 19, 2, "Acuario");
    public static ZodiacSign piscis=new ZodiacSign(20, 2, 20, 3, "Piscis");

    public static ZodiacSign whichSignIAm(LocalDate birthday){
            int month=birthday.getMonthValue();
            int day=birthday.getDayOfMonth();
            if ((month==3&&day>=21)||(month==4&&day<=20)) return aries;
            if ((month==4&&day>=21)||(month==5&&day<=20)) return tauro;
            if ((month==5&&day>=21)||(month==6&&day<=20)) return geminis;
            if ((month==6&&day>=22)||(month==7&&day<=20)) return cancer;
            if ((month==7&&day>=23)||(month==8&&day<=20)) return leo;
            if ((month==8&&day>=24)||(month==9&&day<=20)) return virgo;
            if ((month==9&&day>=24)||(month==10&&day<=20)) return libra;
            if ((month==10&&day>=23)||(month==11&&day<=20)) return escorpio;
            if ((month==11&&day>=23)||(month==12&&day<=20)) return sagitario;
            if ((month==12&&day>=22)||(month==1&&day<=20)) return capricornio;
            if ((month==1&&day>=20)||(month==2&&day<=20)) return acuario;
            if (((month==2)&&(day>=20))||((month==3)&&(day<=20))) return piscis;
            return null;
    }
    
}
