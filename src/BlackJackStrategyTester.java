/**
 * This is the tester of BlackJackStrategy.
 * @author muyiyimiss
 *
 */
public class BlackJackStrategyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Deck d = new Deck();
				
				
				Player h = new Player(d);
				
				
				Player c = new Player(d);
				
				
				BlackJackStrategy b = new BlackJackStrategy(d, c, h);
				
				
				int whoWin = b.playGame();
				if(whoWin == 0){
					System.out.println("Auto-human wins!");
				}if(whoWin == 1){
					System.out.println("Computer wins!");
				}if(whoWin == 2){
					System.out.println("Push!");
				}
			
	}

}
