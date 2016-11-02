import java.awt.*;
import java.applet.*;

public class Applet3 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawLine(250,0,500,433);
  g.drawLine(500,433,0,433);
  g.drawLine(0,433,250,0);

  g.drawLine(0,144,500,144);
  g.drawLine(500,144,250,577);
  g.drawLine(250,577,0,144);






/*  int a[]={100,500,300,200};
  int b[]={200,200,0,200};
  g.drawPolygon(a,b,3);
*/
 }
}
