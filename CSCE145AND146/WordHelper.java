// Made By Damian Sclafani
package CSCE145AND146;

public class WordHelper {
    
    public static String[] sortByVowels(String words[])
	{
		//makes new array
		String[] sorted = new String[words.length];
		for(int i = 0; i < words.length; i++)
		{
			sorted[i] = words[i];
		}
		//sorts by smallest to largest # of vowels
		for(int i = 0; i < sorted.length; i++)
		{
			boolean hasSwapped = true;
			while(hasSwapped)
			{
				hasSwapped = false;
				for(int j = 0; j < sorted.length-1; j++)
				{
					int count1 = 0;
					int count2 = 0;
					for(int k = 0; k < sorted[j].length(); k++)
					{
						if(sorted[j].charAt(k) == 'a' || 
							sorted[j].charAt(k) == 'e' || 
							sorted[j].charAt(k) == 'i' || 
							sorted[j].charAt(k) == 'o' ||
							sorted[j].charAt(k) == 'u' || 
							sorted[j].charAt(k) == 'y')
						{
							count1++;
						}
					}
					for(int k = 0; k < sorted[j+1].length(); k++)
					{
						if(sorted[j+1].charAt(k) == 'a' || 
							sorted[j+1].charAt(k) == 'e' || 
							sorted[j+1].charAt(k) == 'i' || 
							sorted[j+1].charAt(k) == 'o' ||
							sorted[j+1].charAt(k) == 'u' || 
							sorted[j+1].charAt(k) == 'y')
						{
							count2++;
						}
					}
					if(count1 > count2)
					{
						String temp = sorted[j];
						sorted[j] = sorted[j+1];
						sorted[j+1] = temp;
						hasSwapped = true;
					}
				}
			}
		}
		return sorted;
	}
	
	public static String[] sortByConsonants(String words[])
	{
		//creates new array
		String[] sortedC = new String[words.length];
		for(int i = 0; i < words.length; i++)
		{
			sortedC[i] = words[i];
		}
		//sorts from smallest to largest # of consonants
		for(int i = 0; i < sortedC.length; i++)
		{
			boolean hasSwapped = true;
			while(hasSwapped)
			{
				hasSwapped = false;
				for(int j = 0; j < sortedC.length-1; j++)
				{
					int count1 = 0;
					int count2 = 0;
					for(int k = 0; k < sortedC[j].length(); k++)
					{
						if(sortedC[j].charAt(k) != 'a' && 
								sortedC[j].charAt(k) != 'e' && 
								sortedC[j].charAt(k) != 'i' && 
								sortedC[j].charAt(k) != 'o' &&
								sortedC[j].charAt(k) != 'u' && 
								sortedC[j].charAt(k) != 'y')
						{
							count1++;
						}
					}
					for(int k = 0; k < sortedC[j+1].length(); k++)
					{
						if(sortedC[j+1].charAt(k) != 'a' && 
								sortedC[j+1].charAt(k) != 'e' && 
								sortedC[j+1].charAt(k) != 'i' && 
								sortedC[j+1].charAt(k) != 'o' &&
								sortedC[j+1].charAt(k) != 'u' && 
								sortedC[j+1].charAt(k) != 'y')
						{
							count2++;
						}
					}
					if(count1 > count2)
					{
						String temp = sortedC[j+1];
						sortedC[j+1] = sortedC[j];
						sortedC[j] = temp;
						hasSwapped = true;
					}
					
				}
			}
		}
		return sortedC;
	}
	
	public static String[] sortByLength(String words[])
	{
		//creates new array
		String[] sortedL = new String[words.length];
		for(int i = 0; i < words.length; i++)
		{
			sortedL[i] = words[i];
		}
		//sorts from smallest to largest length
		for(int i = 0; i < sortedL.length; i++)
		{
			boolean hasSwapped = true;
			while(hasSwapped)
			{
				hasSwapped = false;
				for(int j = 0; j < sortedL.length-1; j++)
				{
					if(sortedL[j].length() > sortedL[j+1].length())
					{
						String temp = sortedL[j+1];
						sortedL[j+1] = sortedL[j];
						sortedL[j] = temp;
						hasSwapped = true;
					}
				}
			}
		}
		return sortedL;
	}
}
