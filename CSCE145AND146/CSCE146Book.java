// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 S2022 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 */
//Do not alter-----------------------------------------------------------------------
public class CSCE146Book {
    
    private int wordCount;
	public CSCE146Book()
	{
		this.wordCount = 1;
	}
	public CSCE146Book(int aC)
	{
		this.setWordCount(aC);
	}
	public int getWordCount()
	{
		return this.wordCount;
	}
	public void setWordCount(int aC)
	{
		if(aC > 0)
			this.wordCount = aC;
		else
			this.wordCount = 1;
	}
	public String toString()
	{
		return "Book with "+this.wordCount+" words";
	}
}
//-----------------------------------------------------------------------------------
