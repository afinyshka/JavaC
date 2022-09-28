package Seminar_8.HW_002_animals.SubAnimals.SubBirds;

import Seminar_8.HW_002_animals.SubAnimals.Birds;

public class Stork extends Birds{

    public Stork(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor, flyAltitude);
    }

    @Override
    public String makeSound() {
        return "Curr-Curr-Curr!";
    }

    
}
