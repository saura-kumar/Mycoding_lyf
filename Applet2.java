import java.applet.Applet;
import java.awt.Graphics;
class Applet2 extends Applet{
    public void init{
        resize(200,200);
    }
    public void paint(Graphics g){
        g.drawString("this is second java applet",150,150);
    }

}