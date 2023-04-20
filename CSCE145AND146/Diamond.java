// Made By Damian Sclafani
package CSCE145AND146;

public class Diamond extends ShapeBasicsLab20 implements DiamondInterface {

	private int width;
	
	//constructor
	public Diamond()
	{
		super();
		this.width = 0;
	}
	
	//para. const.
	public Diamond(int xOffset, int xWidth)
	{
		super(xOffset);
		this.setWidth(xWidth);
	}
	
	//accessor
	public int getWidth()
	{
		return this.width;
	}
	
	//mutator
	public void setWidth(int xWidth)
	{
		if(xWidth >= 0 && xWidth % 2 == 1)
		{
			this.width = xWidth;
		}
		else
		{
			System.out.println("Invalid Width! Shutting Down!");
			System.exit(0);
		}
	}
	
	//draw the diamond
	public void drawHere()
	{
		drawTopV();
		drawBottomV();
	}
	
	private void drawTopV()
	{
		int center = this.width/2;
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
	
	private void drawBottomV()
	{
		int center = width/2;
		int start = this.getOffset();
		int insideWidth = this.width - 2;
		
		this.skipSpaces(start);
		System.out.print("*");
		this.skipSpaces(insideWidth);
		System.out.print("*");
		System.out.println();
		insideWidth -= 2;
		
		int count = center - 1;
		
		for(int i = 0; i < count; i++)
		{
			start++;
			this.skipSpaces(start);
			System.out.print("*");
			this.skipSpaces(insideWidth);
			System.out.println("*");
			insideWidth -= 2;
		}
		
		this.skipSpaces(this.getOffset() + center);
		
		System.out.print("*");
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
