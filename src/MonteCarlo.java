/**
 * This class will run the Monte Carlo Stimulations.
 * We can use to estimate probability of various events happening.
 * @author muyiyimiss
 *
 */

public class MonteCarlo {
	private int trails;
	private int winTimes;
	private int loseTimes;
	private int pushTimes;

	/**
	 * This is the constructor or the class
	 * @param t is the number of trials to run for the stimulation
	 */
	public MonteCarlo(int t) {
		trails = t;
		runExperiment();
	}



	/**
	 * get how many times human wins
	 * @return times that human win
	 */
	public int getWins() {
		return winTimes;
	}
	
	/**
	 * get how many times human lose
	 * @return times that human lose
	 */
	public int getLoses() {
		return loseTimes;
	}
	
	/**
	 * get how many times human and computer will push
	 * @return times that human and computer push
	 */
	public int getPushes() {
		return pushTimes;
	}

	/**
	 * This method runs the experiment.
	 * It will run each trial and track the number of winsTimes, losesTimes, and pushTimes.
	 */
	private void runExperiment(){
		int win = 0;
		int lose = 0;
		int push = 0;
		
		for(int i = 0; i < trails; i++){
			int s = runTrail();
			
			if (s == 0){
				win++;	
			}
			winTimes = win;
			if (s == 1){
				lose++;
			}
			loseTimes = lose;
			if (s == 2){
				push++;
			}
			pushTimes = push;
		}

	
		
	

	}

	/**
	 * This method will run one trail
	 * it play the blackjack one time.
	 * @return the result of the game: 0 if autohuman wins; 1 if autohuman loses; 2 if autohuman and computer push.
	 */
	public int runTrail(){

		Deck d = new Deck();


		Player h = new Player(d);


		Player c = new Player(d);


		BlackJackStrategy b = new BlackJackStrategy(d, c, h);
		
		int a = b.playGame();

		return a;

	}

}
