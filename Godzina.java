import greenfoot.*;
import java.awt.Color;

public class Godzina extends Actor
{
    String min;
    String sek;
    public void ustawGodziny(int g, int m, int s)
    {
        if(m<10) min=":0"; else min=":";
        if(s<10) sek=":0"; else sek=":";
        setImage(new GreenfootImage(g + min + m+ sek + s, 150, Color.WHITE, null));  
    }    
}
