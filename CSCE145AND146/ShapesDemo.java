// Made By Damian Sclafani
package CSCE145AND146;

public class ShapesDemo {
    
    public void ShapesDemoMain() {

		//Rectangle r = new Rectangle(2, 5, 15);
		
		//r.drawAt(2);
		
		ShapeBasics[] shapes = new ShapeBasics[3];
		
		shapes[0] = new Rectangle(2, 5, 15);
		shapes[1] = new Triangle(2, 7);
		shapes[2] = new Triangle(10, 19);
		
		for(int i = 0; i < shapes.length; i++)
		{
			shapes[i].drawAt(i);
		}
	}
}
