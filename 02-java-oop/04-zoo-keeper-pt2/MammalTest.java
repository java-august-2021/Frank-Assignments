public class MammalTest {
    public static void main(String[] args) {
        // Gorilla g=new Gorilla();
        Bat b= new Bat();

        b.displayEnergy();
        int energy=b.fly(2);
        System.out.println(energy);

        energy=b.eatHumans(2);
        System.out.println(energy);

        energy=b.attackTown(3);
        System.out.println(energy);
    }
}
