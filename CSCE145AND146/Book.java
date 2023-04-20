// Made By Damian Sclafani
package CSCE145AND146;

public class Book {
    
    private String title;
	private String author;
    // private String publisher;
	private int numCopiesSold;
	private int yearOfRelease;
	
	public Book()
	{
		this.title = "title unknown";
		this.author = "unknown";
		// this.publisher = "unknown";
		this.numCopiesSold = 0;
		this.yearOfRelease = 2021;
	}
	
	public Book(String xTitle, String xAuthor, int xNumCopiesSold, int xYearOfRelease)
	{
		this.setTitle(xTitle);
		this.setAuthor(xAuthor);
		this.setNumCopiesSold(xNumCopiesSold);
		this.setYearOfRelease(xYearOfRelease);
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public int getNumCopiesSold()
	{
		return this.numCopiesSold;
	}
	
	public int getYearOfRelease()
	{
		return this.yearOfRelease;
	}
	
	public void setTitle(String xTitle)
	{
		this.title = xTitle;
	}
	
	public void setAuthor(String xAuthor)
	{
		this.author = xAuthor;
	}
	
	public void setNumCopiesSold(int xNumCopiesSold)
	{
		if(xNumCopiesSold >= 0)
		{
			this.numCopiesSold = xNumCopiesSold;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setYearOfRelease(int xYearOfRelease)
	{
		if((xYearOfRelease > 1949) && (xYearOfRelease < 2022))
		{
			this.yearOfRelease = xYearOfRelease;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public String toString()
	{
		return "Title: " + this.title
				+ "\nAuthor: " + this.author
				+ "\nNumber of Copies Sold: " + this.numCopiesSold
				+ "\nYear of Release: " + this.yearOfRelease;
	}
	
	public boolean equals(Book b)
	{
		return this.title.equalsIgnoreCase(b.getTitle())
				&& this.author.equalsIgnoreCase(b.getAuthor())
				&& this.numCopiesSold == b.getNumCopiesSold()
				&& this.yearOfRelease == b.getYearOfRelease();
	}
}
