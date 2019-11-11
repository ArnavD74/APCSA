public class VotingMachine {

	public int totaldem = 0;
	public int totalrep = 0;
	
	public String welcome() {
		String greeting = ("Hello, welcome to this voting machine.");
		return greeting;
}
	
	public void voteDemocrat() {
		totaldem = totaldem + 1;
		System.out.println("You have voted for a democrat.");
	}
	
	public void voteRepublican() {
		totalrep = totalrep+ 1;
		System.out.println("You have voted for a republican.");
	}
	
	public String  getVotes() {
		String totals = ("The total votes are: Democrats=" + totaldem + " and Republicans=" + totalrep);
		return totals;
	}
	
	public void clearState() {
		totalrep = 0;
		totaldem = 0;
		System.out.println("Votes cleared.");
		
	}
}

