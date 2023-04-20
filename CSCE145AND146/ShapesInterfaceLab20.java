// Made By Damian Sclafani
package CSCE145AND146;
/**
 Interface for simple shapes drawn on
 the screen using keyboard characters. 
*/
public interface ShapesInterfaceLab20 {
    /**
     Sets the offset for the drawing.
    */
    public void setOffset(int newOffset);

    /**
     Returns the offset for the drawing.
    */
	public int getOffset();

    /**
     Draws the shape at lineNumber lines down
     from the current line.
    */
    public void drawAt(int lineNumber);

    /**
     Draws the shape at the current line.
    */
    public void drawHere();
}
