// Made By Damian Sclafani
package CSCE145AND146;

public class PickACardFE {
    
    public void PickACardFEMain() {

		PickACard deck = new PickACard();
		System.out.println(deck.pickCard());
		System.out.println();
		System.out.println(deck.pickCardNum());
		System.out.println();
		System.out.println(deck.cardSuit());
	}
}
