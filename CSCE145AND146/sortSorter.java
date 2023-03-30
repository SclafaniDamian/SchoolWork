// Made By Damian Sclafani
package CSCE145AND146;

public class sortSorter {
    private GenLL<String> strings;
	public sortSorter()
	{
		strings = new GenLL<String>();
	}
	public void addString(String str)
	{
		strings.add(str);
	}
	public String getString()
	{
		return strings.getCurrent();
	}
	public void next()
	{
		strings.gotoNext();
	}
	public void resetStrings()
	{
		strings.reset();
		while(listHasMore())
		{
			strings.removeCurrent();
			//next();
		}
		strings.reset();
	}
	public int stringListSize()
	{
		return strings.getSize();
	}
	private boolean listHasMore()
	{
		return strings.hasMore();
	}
}
