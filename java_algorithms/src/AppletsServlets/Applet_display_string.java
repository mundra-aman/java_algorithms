package AppletsServlets;


	import java.awt.*;
import java.applet.*;
	/*
	<applet code="SimpleApplet" width=200 height=60>
	</applet>
	*/

	@SuppressWarnings("serial")
	public class Applet_display_string extends Applet {
	  public void paint(Graphics g) {
	    g.drawString("A Simple Applet", 20, 20);
	  }
	}