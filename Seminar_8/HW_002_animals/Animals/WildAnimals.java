package Seminar_8.HW_002_animals.Animals;

import Seminar_8.HW_002_animals.Animal;

public abstract class WildAnimals extends Animal{
    protected String habitat;
    protected String dateDiscovery;
 
    public WildAnimals(int height, int weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }


    @Override
    public void makeSound() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + 
        ", habitat area = " + habitat + ", date of discovery = " + dateDiscovery;
    }
    

}
