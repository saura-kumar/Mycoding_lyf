import java.applet.Applet;
import java.awt.*;
public class Rectangletest extends Applet{
    int x,y,w,h;
    public void init(){
        x=Integer.parseInt(getParameter("x value"));
        y=Integer.parseInt(getParameter("y value"));
        w=Integer.parseInt(getParameter("w value"));
        h=Integer.parseInt(getParameter("h value"));
    }
    public void paint(Graphics g){
        g.drawRect(x,y,w,h);
    }
}