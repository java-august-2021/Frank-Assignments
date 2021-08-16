public class Bat extends MammalAnimal {
    public Bat (){ 
        energyLevel=300;
    }

    public int fly(int flyNum){
        System.out.println("fly");
        return energyLevel-(50*flyNum);
    }

    public int eatHumans(int humanNum){
        System.out.println("So well, Never mind");
        return energyLevel-(25*humanNum);
    }

    public int attackTown(int townNum){
        System.out.println(" the sound of a town on fire");
        return energyLevel-(100*townNum);
    }
}
