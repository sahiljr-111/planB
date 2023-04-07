import java.awt.*;
import java.util.*;
import java.applet.*;
/*<applet code="clock" width=400 height=200></applet>*/
public class clock extends Applet
{
	String t;
	Font F;
	public void init()
	{
		F=new Font(t,Font.BOLD,100);
		setFont(F);
	}
	public void paint(Graphics g)
	{
		t=new Date().toString().substring(3,19);
		g.drawString(t,50,100);
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{}
		repaint();
	}
}