import java.util.ArrayList;

public class Dog extends Pet

{

	private String breed;

	public Dog(String n, String b)

	{

		super(n, "dog");

		breed = b;

	}

	public void printPetInfo()

	{

		System.out.print(getName() + " is a dog of breed " + breed);
	}

	public static void main(String[] args) {

		Dog fluffy = new Dog("Fluffy", "pomeranian");

		fluffy.printPetInfo();
		System.out.println();

		ArrayList<Pet> petList = new ArrayList<Pet>();

		/* missing code */

		// A rabbit named Floppy
		// A dog (whose breed is pug) named Arty

		Pet pet1 = new Pet("Floppy", "Rabbit");
		Pet pet2 = new Dog("Arty", "Pug");

		petList.add(pet1);
		petList.add(pet2);

		PetOwner owner1 = new PetOwner(pet1, "Jerry");
		PetOwner owner2 = new PetOwner(pet2, "Kris");
		
		owner1.printOwnerInfo();
		owner2.printOwnerInfo();

	}

}