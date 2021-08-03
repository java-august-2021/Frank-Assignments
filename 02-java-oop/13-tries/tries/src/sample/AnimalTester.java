package sample;

import java.util.ArrayList;

public class AnimalTester {
	public static void main(String[] args) {
		System.out.println("Spring Tool Suite Rocks!");
		
		Animal buster = new Animal("dog", "Buster", 100, 'M', 50);
		Animal penguin = new Animal("penguin", "Peter", 100, 'M', 80);
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(buster);
		myAnimals.add(penguin);
		
		for(Animal a : myAnimals) {
			System.out.println(a.getSpecies());
		}
	}
}
