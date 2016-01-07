import greenfoot.*;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Kalendarz extends World
{
   Godzina godzina;
   AktualnaData data;
    public Kalendarz()
    {    
        super(600, 400, 1); 
        godzina = new Godzina();
        data = new AktualnaData();
        addObject(data, 300, 25);
        addObject(godzina, 300,200);
    }
    
    public void act(){
       GregorianCalendar dzis = new GregorianCalendar();
       int dzienTyg = dzis.get(Calendar.DAY_OF_WEEK);
       int dzien = dzis.get(Calendar.DAY_OF_MONTH);
       int miesiac = dzis.get(Calendar.MONTH);
       int rok = dzis.get(Calendar.YEAR);
       int sekundy = dzis.get(Calendar.SECOND);
       int minuty = dzis.get(Calendar.MINUTE);
       int godziny = dzis.get(Calendar.HOUR_OF_DAY);
       data.ustawDate(dzienTyg, dzien, miesiac, rok);
       godzina.ustawGodziny(godziny,minuty,sekundy);
       }
}
