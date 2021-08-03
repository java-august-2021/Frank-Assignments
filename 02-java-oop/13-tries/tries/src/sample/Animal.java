package sample;

public class Animal {
	private String species;
	private String name;
	private int health;
	private char gender;
	private int speed;
	
	public Animal(String species, String name, int health, char gender, int speed) {
		this.species = species;
		this.name = name;
		this.health = health;
		this.gender = gender;
		this.speed = speed;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
