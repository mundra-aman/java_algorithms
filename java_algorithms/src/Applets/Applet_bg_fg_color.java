/*********************************************************************
 
 Description : A simple applet that sets the foreground and background 
 				colors and outputs a string.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package Applets;

	
	import java.awt.*;
	import java.applet.*;
	
	/*
	<applet code="Sample" width=300 height=50>
	</applet>
	*/

	@SuppressWarnings("serial")
	public class Applet_bg_fg_color extends Applet{
	  String msg;

	  // set the foreground and background colors.
	  public void init() {
	    setBackground(Color.cyan);
	    setForeground(Color.red);
	    msg = "Inside init( ) --";
	  }

	  // Initialize the string to be displayed.
	  public void start() {
	    msg += " Inside start( ) --";
	  }

	  // Display msg in applet window.
	  public void paint(Graphics g) {
	    msg += " Inside paint( ).";
	    g.drawString(msg, 10, 30);
	  }
	}