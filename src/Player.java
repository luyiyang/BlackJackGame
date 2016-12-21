import java.util.Random;
/**
 * This class is a player.
 * A player can access to a deck of 52 cards.
 * A player can draw cards and calculate the sum of the cards.
 * Note: A player is just a player, so a player does not necessarily know any rules about blackjack.
 * @author muyiyimiss
 * 
 */
public class Player {
	/**
	 * There are the instance variables of the class Player
	 * A player has a deck of cards, the sum of their cards in hand, and also knows the number of Ace in hand.
	 */
	private Deck deck;
	private int sum;
	private int numberOfAce;
	
	/**
	 * This is the constructor of Player
	 * @param d, the deck of cards that the a player uses to play
	 */
	public Player(Deck d){
		deck = d;
		sum = 0;
		numberOfAce = 0;
		
	}
	
	/**
	 * The method playerDraw will draw a card from a deck
	 * @return it will return the card drawn by the player. 
	 */
	public Card playerDraw(){
		
		Card bedrawn = deck.drawCard();
		int rank = bedrawn.getRank()+1;
		
		if(rank == 11){
			sum += 10;
		}
		else if(rank == 12){
			sum += 10;
		}
		else if(rank == 13){
			sum += 10;
		}
		else if(rank == 1){
			numberOfAce ++;
			sum += 1;
		}
		else{
			sum += rank;
		}
		
		return bedrawn;
	}
	
	/**
	 * This method will calculate the sum of the cards drawn by the player.
	 * This method has is responsible for dealing with the cases when there are Aces
	 * @return the sum of the cards drawn by the player. 
	 */
	public int getSum(){
		
		if(numberOfAce != 0) {
			if(sum + 10 <= 21){
				sum += 10;
			}
		} 
		return sum;
	}
	
}
