import java.awt.*;
import java.applet.*;

public class Hello extends Applet
{
 
 public void paint(Graphics g)
 {
 g.drawOval(100,30,300,400);//cloced face 
 g.drawOval(400,200,50,100);//right hear
 g.drawOval(50,200,50,100);//left hear

 g.drawOval(150,320,200,40);//mouth
 //g.drawRect(150,320,200,40);//rect

 g.drawOval(150,150,50,50);//left eye
 g.drawOval(300,150,50,50);//right eye

 g.drawOval(230,200,40,100);//nose

}

}
