/**
 * This is a card class.
 * Each card has a suit and a rank.
 * @author muyiyimiss
 * 
 */
public class Card {
	
	/**
	 * These are the instance variables of the class Card
	 * Each card has two private variables: a suit(0-4) and a rank(0-12);
	 */
	private int suit;
	private int rank;
	
	
	/**
	 * This is the constructor of the Card class
	 * @param suit the suit of a card
	 * @param rank the rank of a card
	 */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	/**
	 * This is the get method of a card's suit
	 * @return it will return a card's suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * This is the get method of a card's rank
	 * @return it will return a card's rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * The showCard() method will give the user a poker card representation of each card.
	 * The suit, 0-4, which is now Spade, Club, Diamond, Heart
	 * The rank, 0-12, which is now Ace, 1, 2, .... J, Q, K
	 */
	public void showCard(){	

		String color = null;
		String number = null;
		
		if(rank == 0){
			number = "ACE";
		}
		
		if(rank ==1){
			number = "2";
		}
		
		if(rank ==2){
			number = "3";
		}
		
		if(rank == 3){
			number = "4";
		}
		
		if(rank ==4){
			number = "5";
		}
		
		if(rank ==5){
			number = "6";
		}
		
		if(rank ==6){
			number = "7";
		}
		
		if(rank ==7){
			number = "8";
		}
		
		if(rank ==8){
			number = "9";
		}
		
		if(rank ==9){
			number = "10";
		}
		
		if(rank == 10){
			number = "JACK";
		}
		
		if(rank == 11){
			number = "QUENN";
		}
		
		if(rank == 12){
			number = "KING";
		}
		
		
		if(suit == 0){
			color = "SPADE";
		}
		
		if(suit == 1){
			color = "CLUB";
		}
		
		if(suit == 2){
			color = "DIAMOND";
		}
		
		if(suit == 3){
			color = "HEART";
		}
		
		
		System.out.printf("[" + color + " " + number + "]\n");
		
	}
	
	

}
