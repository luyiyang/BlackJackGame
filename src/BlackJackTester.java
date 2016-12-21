/**
 * This is the BlackJackTester
 * @author muyiyimiss
 * 
 */
public class BlackJackTester {

	public static void main(String[] args) {
		
		//There should be a deck called d.
		Deck d = new Deck();
		
		//There is a human player who is using the deck called d.
		Player h = new Player(d);
		
		//There is a computer player who is also using the deck called d.
		Player c = new Player(d);
		
		//The BlackJackGame object is created.
		BlackJackGame b = new BlackJackGame(d, c, h);
		
		//Play the game!!
		b.playGame();
	}

}
