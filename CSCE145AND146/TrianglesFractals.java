// Made By Damian Sclafani
package CSCE145AND146;
import java.awt.*;
import javax.swing.*;
//import java.util.*;

public class TrianglesFractals extends Canvas {
    
    public void TrianglesFractalsMain() {
		JFrame frame = new JFrame("Triangles! Oh Fractals!");
		frame.setSize(1024,1024);
		TrianglesFractals sp = new TrianglesFractals();
		frame.add(sp);
		frame.setVisible(true);//allows the triangles to be visible
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		drawTriangle(0,0,this.getSize().height,g);
	}
	public void draw(Graphics g)
	{
		paint(g);
	}
	public void drawTriangle(int x, int y, int side, Graphics g)
	{
		int sub = side;
		if(side == getSize().height) 
		{
			sub = side/4 + 10; //manipulates the amount of triangles
		}
		int[] xP = {x+sub,x+2*sub,x+3*sub};//1st triangle
		int[] yP = {y+3*sub,y+sub,y+3*sub};//2nd triangle
		
		g.setColor(Color.GREEN);//sets the color to green
		g.fillPolygon(xP,yP,3);//makes the triangle shape
		if(sub >= 4)//pixel limit = 4
		{
			int[] nXP = {((xP[0]+xP[1])/2),((xP[2]+xP[0])/2),((xP[2]+xP[1])/2)};
			int[] nYP = {((yP[0]+yP[1])/2),((yP[2]+yP[0])/2),((yP[2]+yP[1])/2)};
			
			g.setColor(Color.DARK_GRAY);
			g.fillPolygon(nXP,nYP,3);
			
			drawTriangle(xP[1]-sub/2,nYP[0]-sub/2,sub/2,g);
			drawTriangle(nXP[0]-sub/2,yP[1]-sub/2,sub/2,g);
			drawTriangle(xP[0]-sub/2,nYP[0]-sub/2,sub/2,g);
		}
	}
}
