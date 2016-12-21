/**
 * This is the tester of Monte Carlo stimulations
 * It will print out, after running 1000 times, how many times human will win; how many times human will lose; how many times human and computer will push.
 * @author muyiyimiss
 *
 */
public class MonteCarloTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonteCarlo mc = new MonteCarlo(1000);
		
		int wins = mc.getWins();
		int loses = mc.getLoses();
		int pushes = mc.getPushes();
		
		System.out.println("After playing BlackJack 1000 times: ");
		System.out.println("Auto-human won: "+ wins + " times.");
		System.out.println("Auto-human lost: " + loses + " times.");
		System.out.println("Auto-human and computer pushed: " + pushes + " times.");
		System.out.println("Auto-human's probability of winning is: " + (double) wins/10 + "%");
		System.out.println("Auto-human's probability of pushing is: " + (double) pushes/10 + "%");
		System.out.println("Auto-human's probability of losing is: " + (double) loses/10 + "%");
		System.out.println("Auto-human's probability of not losing is: " + (double) (wins+pushes)/10 + "%");
		
	}

}
