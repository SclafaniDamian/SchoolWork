// Made By Damian Sclafani
package CSCE145AND146;

public class Triangle extends ShapeBasics implements TriangleInterface {
    private int base;
	
	public Triangle()
	{
		super();
		this.base = 0;
	}
	
	public Triangle(int xOffset, int xBase)
	{
		super(xOffset);
		this.setBase(xBase);
	}
	
	public int getBase()
	{
		return this.base;
	}
	
	public void setBase(int xBase)
	{
		if(xBase >= 0 && xBase % 2 == 1)
		{
			this.base = xBase;
		}
	}
	
	public void drawHere()
	{
		drawTop();
		drawBase();
	}
	
	private void drawTop()
	{
		int center = this.base/2;
		int start = this.getOffset() + center;
		
		this.skipSpaces(start);
		
		System.out.print("*");
		System.out.println();
		
		int insideWidth = 1;
		int count = center - 1;
		
		for(int i = 0; i < count; i++)
		{
			start--;
			this.skipSpaces(start);
			System.out.print("*");
			this.skipSpaces(insideWidth);
			System.out.println("*");
			insideWidth += 2;
		}
	}
	
	private void drawBase()
	{
		this.skipSpaces(this.getOffset());
		for(int i = 0; i < this.base; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	private void skipSpaces(int spaces)
	{
		for(int i = 0; i < spaces; i++)
		{
			System.out.print(" ");
		}
	}
}
