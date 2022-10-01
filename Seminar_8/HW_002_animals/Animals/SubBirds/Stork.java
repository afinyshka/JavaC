package Seminar_8.HW_002_animals.Animals.SubBirds;

import Seminar_8.HW_002_animals.Animals.Birds;

public class Stork extends Birds{

    public Stork(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor, flyAltitude);
    }

    @Override
    public void makeSound() {
        System.out.println("Curr-Curr-Curr!");
    }

    
}
