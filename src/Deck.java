import java.util.ArrayList;
import java.util.Random;

/**
 * This class represents a deck of cards
 * @author muyiyimiss
 * 
 */
public class Deck {
	
	/**
	 * This is the instance variable of the class deck
	 * A deck has an array of cards.
	 */
	private ArrayList<Card> card;
	
	/**
	 * This is the constructor of the deck
	 */
	public Deck() {
		card = new ArrayList<Card>();
		
	}

	/**
	 * The createDeck method will create a full deck with 52 cards.
	 * i represents the suit of a card
	 * j represents the rank of a card
	 * For each(i,j) in the loop, a new object card(i,j) is created and add to the deck's array list
	 */
	public void createDeck(){
		
		for(int i = 0; i<4; i++){
			for(int j = 0; j<13; j++){
				Card aCard = new Card(i,j);
				card.add(aCard);
			}
		}
		
	}
	
	
	/**
	 * The drawCard method will draw one card randomly from the deck.
	 * After it was drawn, it is removed from the deck.
	 * @return it will return a card with a type Card, which is drawn and removed.
	 */
	public Card drawCard(){
		Card bedrawn;
		Random rand = new Random();
		int indexDrawn = rand.nextInt(card.size());
		bedrawn = card.get(indexDrawn);
		card.remove(indexDrawn);
		return bedrawn;
	}

	
}


