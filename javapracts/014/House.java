import java.awt.*;
import java.applet.*;

public class House extends Applet
{
 public void paint(Graphics g)
 {
  g.fillRect(10,10,10,10);

  g.drawLine(100,100,800,100);
  g.drawLine(800,100,900,200);
  g.drawLine(900,200,0,200);
  g.drawLine(0,200,100,100);
  g.drawRect(100,200,700,400);
  
  g.drawRect(500,350,200,250);
  g.fillRect(200,400,100,100);

}

}
