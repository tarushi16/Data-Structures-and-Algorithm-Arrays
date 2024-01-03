import java.applet.*;
import java.awt.*;
import java.lang.Math;
public class MyLine extends Applet
{
    //Function to initialize the applet
    public void init()
    {
        setBackground(Color.white);
    }
    //Function to draw the line
    public void paint(Graphics g)
    {
        int x1 = (int)(Math.random()*1000)%500;
        int y1 = (int)(Math.random()*1000)%500;

        int x2 = (int)(Math.random()*1000)%500;
        int y2 = (int)(Math.random()*1000)%500;

        g.drawLine(x1,y1,x2,y2);
    }
}
/*
<applet code = Line.class width = 500 height = 500>
</applet>
*/