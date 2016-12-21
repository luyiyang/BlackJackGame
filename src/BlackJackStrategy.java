/**
 * This class has an auto human player that also has a fixed strategy
 * @author muyiyimiss
 *
 */
public class BlackJackStrategy {

	/**
	 * A blackjack game will have a deck, two players: an autohuman player and a computer player
	 */
	private Deck aDeck;
	private Player computer;
	private Player autohuman;


	/**
	 * This is the constructor of BlackJack game.
	 * @param d, a deck
	 * @param c, a computer player
	 * @param h, an autohuman player
	 */
	public BlackJackStrategy(Deck d, Player c, Player h){
		aDeck = d;
		aDeck.createDeck();
		computer = c;
		autohuman = h;
	
	}


	/**
	 * This method will play the game.
	 */
	public int playGame() {
		
		int win = 0;
		
		int cSum = computerPlay();

		int hSum = humanPlay();

		
		if (hSum <= 21 && cSum <= 21) {

			if(autohuman.getSum() > computer.getSum()){
				win = 0;
			}

			if(autohuman.getSum() < computer.getSum()){
				win = 1;
			}

			if(autohuman.getSum() == computer.getSum()){
				win = 2;
			}

		}else {

			if(autohuman.getSum()>21){
				win = 1;
			}

			else if(computer.getSum()>21){
				win = 0;
			}

		}
		
		return win;

	}

	/**
	 * The method will let the computer play the game
	 * The computer's strategy is fixed.
	 * @return The sum of computer's cards in hand.
	 */
	public int computerPlay(){

		
		Card faceUp = computer.playerDraw();
		//System.out.println("The faceup card is: ");
		//faceUp.showCard();

		
		Card faceDown = computer.playerDraw();
		
		int computerSum = computer.getSum();
		
		while(computerSum < 17){
			Card computerHit = computer.playerDraw();	
			//computerHit.showCard();
			computerSum = computer.getSum();
		}

		return computerSum;
	}


	/**
	 * This method will let human play
	 * The human's strategy is also fixed, as same as the computer's strategy
	 * @return it will return the sum of human's card in hand
	 */
	public int humanPlay(){

		
		Card card1 = autohuman.playerDraw();
		
		Card card2 = autohuman.playerDraw();
		

		int humanSum = autohuman.getSum(); 
		
		while(humanSum < 17){
			Card humanHit = autohuman.playerDraw();	
			
			humanSum = autohuman.getSum();
		}
		
		return humanSum;
	}

}
