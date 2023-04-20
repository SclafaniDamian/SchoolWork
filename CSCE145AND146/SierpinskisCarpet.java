// Made By Damian Sclafani
package CSCE145AND146;
import java.awt.*;
import javax.swing.*;
//import java.util.*;

public class SierpinskisCarpet extends Canvas {
    
    public void SierpinskisCarpetMain() {
		
		JFrame frame = new JFrame("Sierpinski's Carpet");
		frame.setSize(900,900);
		
		SierpinskisCarpet sp = new SierpinskisCarpet();
		frame.add(sp);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//Overridden method in Canvas
	public void paint(Graphics g)
	{
		drawCarpet(0,0,getSize().height,g);
	}
	public void drawCarpet(int x, int y, int side, Graphics g)
	{
		int sub = side / 3;
		g.fillRect(x+sub, y+sub, sub, sub);
		if(sub >= 3)
		{
			//Top
			drawCarpet(x,y,sub,g);//Left
			drawCarpet(x+sub,y,sub,g);//Middle
			drawCarpet(x+sub*2,y,sub,g);//Right
			//Middle
			drawCarpet(x,y+sub,sub,g);//Left
			drawCarpet(x+sub*2,y+sub,sub,g);//Right
			//Bottom
			drawCarpet(x,y+sub*2,sub,g);//Left
			drawCarpet(x+sub,y+sub*2,sub,g);//Middle
			drawCarpet(x+sub*2,y+sub*2,sub,g);//Right
		}
	}
}
