public class Superhero

{

	private String name;

	private String secretIdentity;

	private int strength;

	public Superhero(String realName, String codeName)

	{

		name = realName;

		secretIdentity = codeName;

		strength = 5;

	}

	public int levelUp(int amount) // line 14

	{

		return strength += amount; // line 16

	}

}