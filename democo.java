import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class democo extends Applet{
    public void init(){
        setBackground(Color.RED);
        resize(400,400);

    }
    public void paint(Graphics g){
        g.drawString("Applet background example",0,50);
    }
}