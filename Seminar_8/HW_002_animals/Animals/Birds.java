package Seminar_8.HW_002_animals.Animals;

import Seminar_8.HW_002_animals.Animal;
import Seminar_8.HW_002_animals.Interfaces.IFlyable;

public abstract class Birds extends Animal implements IFlyable {
    protected int flyAltitude;

    public Birds(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor);
        this.flyAltitude = flyAltitude;
    }

    @Override
    public void fly() {
        System.out.printf("I fly at %d m...\n", flyAltitude);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", flying altitude = " + flyAltitude + " m.";
    }
    

}
