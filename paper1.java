import java.awt.*;
import java.applet.*;
/*
	<applet code="paper1.class" height="500" width="500"></applet>
*/
public class paper1 extends Applet{
	public void paint(Graphics g){
		int x[] = {260,135,385};
		int y[] = {100,360,360};

		g.drawOval(100,100,320,320);

		g.setColor(Color.red);
		g.fillPolygon(x,y,3);
		
	}
}