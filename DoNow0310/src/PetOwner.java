public class PetOwner {

	private Pet thePet;
	private String owner;

	public PetOwner(Pet p, String o) {

		thePet = p;

		owner = o;

	}

	public void printOwnerInfo() {

		thePet.printPetInfo();
		
		System.out.print(" owned by " + owner);
		System.out.println();
		
		

	}

}