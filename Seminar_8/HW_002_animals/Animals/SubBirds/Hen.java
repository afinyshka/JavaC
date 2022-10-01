package Seminar_8.HW_002_animals.Animals.SubBirds;

import Seminar_8.HW_002_animals.Animals.Birds;

public class Hen extends Birds{

    public Hen(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor, flyAltitude);
        flyAltitude = 1;
    }
    public Hen(int height, int weight, String eyesColor) {
        super(height, weight, eyesColor, 1); //
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cluck-cluck-cluck!");
    }

}
