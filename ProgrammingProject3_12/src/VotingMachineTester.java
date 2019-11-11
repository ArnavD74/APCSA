
public class VotingMachineTester {

	public static void main(String[] args) {
		
		VotingMachine votingmachine1 = new VotingMachine();
		System.out.println(votingmachine1.welcome());
		votingmachine1.voteDemocrat();
		votingmachine1.voteDemocrat();
		votingmachine1.voteDemocrat();
		votingmachine1.voteRepublican();
		votingmachine1.voteRepublican();
		System.out.println(votingmachine1.getVotes());
		votingmachine1.clearState();
		System.out.println(votingmachine1.getVotes());
	}
}
