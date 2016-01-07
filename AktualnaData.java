import greenfoot.*;
import java.awt.Color;

public class AktualnaData extends Actor
{
    String[] dni = {"niedziela","poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};
    String[] mies = {"stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "września", "października" ,"listopada","grudnia"};
    
    public void ustawDate(int dt, int d, int m, int r)
    {
        setImage(new GreenfootImage(dni[dt-1] + ", "+ d+" " + mies[m]+ " " + r, 60, Color.WHITE, null));  
    }    
}