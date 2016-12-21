import java.util.Scanner;

/**
 * This class is called BlackJack, which is responsible for playing the games and specify all the rules.
 * @author muyiyimiss
 * 
 */
public class BlackJackGame {


	/**
	 * A blackjack game will have a deck, two players: a human player and a computer player
	 */
	private Deck aDeck;
	private Player computer;
	private Player human;


	/**
	 * This is the constructor of BlackJack game.
	 * @param d, a deck
	 * @param c, a human player
	 * @param h, a computer player
	 */
	public BlackJackGame(Deck d, Player c, Player h){
		aDeck = d;
		aDeck.createDeck();
		computer = c;
		human = h;
	}


	/**
	 * This method will play the game.
	 */
	public void playGame() {

		//Then it will show greetings to the players.
		System.out.println("============================================");
		System.out.println("Welcome to blackjack!");

		System.out.println("--------------------------------------------");
		int cSum = computerPlay();
		//System.out.println("Computer Sum: " + cSum);

		System.out.println("--------------------------------------------");

		int hSum = humanPlay();

		System.out.println("--------------------------------------------");

		//If both human and computer are not over 21 and not equal, whoever larger wins. 
		//If they are same, push.
		if (hSum <= 21 && cSum <= 21) {

			if(human.getSum() > computer.getSum()){
				System.out.println("You are larger! you win!");
			}

			if(human.getSum() < computer.getSum()){
				System.out.println("Computer is larger! Computer wins!");
			}

			if(human.getSum() == computer.getSum()){
				System.out.println("Push!");
			}

		}else {

			//If human gets over 21, human will lose.
			if(human.getSum()>21){
				System.out.println("You bust! Computer win!");
			}

			//If computer gets over 21, computer will lose.
			else if(computer.getSum()>21){
				System.out.println("Computer busts! You win!");
			}

		}



	}

	/**
	 * The method will let the computer play the game
	 * The computer's strategy is fixed.
	 * @return The sum of computer's cards in hand.
	 */
	public int computerPlay(){

		//The computer will draw two cards 
		System.out.println("Computer draws two cards.");

		//The computer will draw the first card, which is face up, letting the human player know.
		Card faceUp = computer.playerDraw();
		System.out.println("The faceup card is: ");
		faceUp.showCard();

		//The computer will draw the second card, which is face down, not letting the human player know.
		Card faceDown = computer.playerDraw();
		//System.out.println("The face down card is: ");
		//faceDown.showCard();

		//The computer's strategy is fixed. If it is less than 17, it will keep drawing.
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
	 * @return it will return the sum of human's card in hand
	 */
	public int humanPlay(){

		System.out.println("Now it is your turn. You will draw two cards");

		//The human player draws will draw the first card and he or she will know the what card it is.
		Card card1 = human.playerDraw();
		System.out.println("You draw a: ");
		card1.showCard();

		//The human player draws will draw the second card and he or she will know the what card it is.
		Card card2 = human.playerDraw();
		System.out.println("You draw a: ");
		card2.showCard();

		//The current sum of the human player's cards will be calculated.
		int humanSum = human.getSum(); 
		System.out.println("Your current sum is: " + humanSum);	

		//It's the human player's choice to choose whether to hit or stand, which will let the human player do input.
		System.out.println("Do you want to hit or stand? Enter 'h' for hit; 's' for stand");	

		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		while(answer.equalsIgnoreCase("h")){

			//While the human player wants to hit, he or she will draw another card and the card is shown.
			Card cardHit = human.playerDraw();

			System.out.println("You draw a: ");
			cardHit.showCard();

			humanSum = human.getSum();
			System.out.println("Your current sum is: " + humanSum);	

			//If the human player now get over or equals to 21, he or she will not be able to hit. 
			if(humanSum>21){
				break;
			}

			//If the human player's sum is not over 21, he or she will choose whether to hit or stand.
			else{
				System.out.println("Do you want to hit again or stand? Enter 'h' for hit; 's' for stand");
				answer = input.nextLine();
			}
		}

		return humanSum;
	}


}
