package Seminar_8.HW_002_animals.SubAnimals;

import Seminar_8.HW_002_animals.Animal;

public abstract class Birds extends Animal {
   protected int flyAltitude;

    public Birds(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor);
        this.flyAltitude = flyAltitude;
    }

    public String fly() {
       return String.format("I fly at %d m...", flyAltitude);
    }

    
}
