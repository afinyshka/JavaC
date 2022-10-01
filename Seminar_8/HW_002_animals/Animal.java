package Seminar_8.HW_002_animals;

import Seminar_8.HW_002_animals.Interfaces.ISoundableInfo;

public abstract class Animal implements ISoundableInfo {
    protected int height;
    protected int weight;
    protected String eyesColor;

    public Animal(int height, int weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public Animal() {
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    // public abstract String makeSound();

    public String getInfo() {
        return "height = " + height + " sm" +
                ", weight = " + weight + " kg" +
                ", eyes's color = " + eyesColor;
    }

    @Override
    public String toString() {
        return getInfo();
    }

}
