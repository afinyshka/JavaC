package Seminar_8.HW_002_animals.Animals.SubDomesticAnimals;

import Seminar_8.HW_002_animals.Animals.DomesticAnimals;

public class Cat extends DomesticAnimals{
    protected boolean hasFur;

    public Cat(int height, int weight, String eyesColor,
    String name, String breed, boolean vaccination,
    String furColor, String birthDate, boolean hasFur) {
        super (height, weight, eyesColor, name, breed, vaccination, furColor, birthDate);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Miau-miau-miau...");
        
    }
     @Override
     public String getInfo() {
         return super.getInfo() + ", has fur = " + hasFur + ".";
     }
}
