package Seminar_8.HW_002_animals.Animals;

import Seminar_8.HW_002_animals.Animal;
import Seminar_8.HW_002_animals.Interfaces.IAffectionable;

public abstract class DomesticAnimals extends Animal implements IAffectionable{

    protected String name;
    protected String breed;
    protected boolean vaccination;
    protected String furColor;
    protected String birthDate;

    public DomesticAnimals(int height, int weight, String eyesColor,
            String name, String breed, boolean vaccination,
            String furColor, String birthDate) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.furColor = furColor;
        this.birthDate = birthDate;
    }

    @Override
    public void showAffection() {
        System.out.println("I love my owner.");
    }

    @Override
    public String getInfo() {
        return "name = " + name + ", breed = " + breed + ", birth date = " + birthDate + ", " + super.getInfo() + 
        ", fur color = " + furColor + ", vaccination = " + vaccination;
    }

}
