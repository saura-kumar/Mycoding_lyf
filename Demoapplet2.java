import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Demoapplet2 extends Applet{
    public void init(){
        setBackgroound(Color.YELLOW);

    }
    public void paint(Graphics g){
        g.drawString("Applet background example");
    }
}