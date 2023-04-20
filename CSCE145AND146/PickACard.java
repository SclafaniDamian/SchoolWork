// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Random;

public class PickACard {
    
    Random r = new Random();
	public String pickCard()
	{
		int card = r.nextInt(54);
		switch(card)
		{
		case 0:
			return "Ace of Spades";
		case 1:
			return "Ace of Clubs";
		case 2:
			return "Ace of Hearts";
		case 3:
			return "Ace of Diamonds";
		case 4:
			return "2 of Spades";
		case 5:
			return "2 of Clubs";
		case 6:
			return "2 of Hearts";
		case 7:
			return "2 of Diamonds";
		case 8:
			return "3 of Spades";
		case 9:
			return "3 of Clubs";
		case 10:
			return "3 of Hearts";
		case 11:
			return "3 of Diamonds";
		case 12:
			return "4 of Spades";
		case 13:
			return "4 of Clubs";
		case 14:
			return "4 of Hearts";
		case 15:
			return "4 of Diamonds";
		case 16:
			return "5 of Spades";
		case 17:
			return "5 of Clubs";
		case 18:
			return "5 of Hearts";
		case 19:
			return "5 of Diamonds";
		case 20:
			return "6 of Spades";
		case 21:
			return "6 of Clubs";
		case 22:
			return "6 of Hearts";
		case 23:
			return "6 of Diamonds";
		case 24:
			return "7 of Spades";
		case 25:
			return "7 of Clubs";
		case 26:
			return "7 of Hearts";
		case 27:
			return "7 of Diamonds";
		case 28:
			return "8 of Spades";
		case 29:
			return "8 of Clubs";
		case 30:
			return "8 of Hearts";
		case 31:
			return "8 of Diamonds";
		case 32:
			return "9 of Spades";
		case 33:
			return "9 of Clubs";
		case 34:
			return "9 of Hearts";
		case 35:
			return "9 of Diamonds";
		case 36:
			return "10 of Spades";
		case 37:
			return "10 of Clubs";
		case 38:
			return "10 of Hearts";
		case 39:
			return "10 of Diamonds";
		case 40:
			return "Jack of Spades";
		case 41:
			return "Jack of Clubs";
		case 42:
			return "Jack of Hearts";
		case 43:
			return "Jack of Diamonds";
		case 44:
			return "Queen of Spades";
		case 45:
			return "Queen of Clubs";
		case 46:
			return "Queen of Hearts";
		case 47:
			return "Queen of Diamonds";
		case 48:
			return "King of Spades";
		case 49:
			return "King of Clubs";
		case 50:
			return "King of Hearts";
		case 51:
			return "King of Diamonds";
		case 52:
			return "Joker";
		case 53:
			return "Joker";
		default:
			return null;
		}
	}
	public int pickCardNum()
	{
		if(pickCard().indexOf("Ace") != -1)
		{
			return 1;
		}
		else if(pickCard().indexOf("2") != -1)
		{
			return 2;
		}
		else if(pickCard().indexOf("3") != -1)
		{
			return 3;
		}
		else if(pickCard().indexOf("4") != -1)
		{
			return 4;
		}
		else if(pickCard().indexOf("5") != -1)
		{
			return 5;
		}
		else if(pickCard().indexOf("6") != -1)
		{
			return 6;
		}
		else if(pickCard().indexOf("7") != -1)
		{
			return 7;
		}
		else if(pickCard().indexOf("8") != -1)
		{
			return 8;
		}
		else if(pickCard().indexOf("9") != -1)
		{
			return 9;
		}
		else if(pickCard().indexOf("10") != -1)
		{
			return 10;
		}
		else
		{
			return 0;
		}
	}
	public String cardSuit()
	{
		if(pickCard().indexOf("Spades") != -1)
		{
			return "Spades";
		}
		else if(pickCard().indexOf("Clubs") != -1)
		{
			return "Clubs";
		}
		else if(pickCard().indexOf("Hearts") != -1)
		{
			return "Hearts";
		}
		else if(pickCard().indexOf("Diamonds") != -1)
		{
			return "Diamonds";
		}
		else
		{
			return null;
		}
	}
}
