package Seminar_8.HW_002_animals.SubAnimals;

import Seminar_8.HW_002_animals.Animal;

public abstract class WildAnimals extends Animal{
    protected String habitat;
    protected String dateDiscovery;
 
    public WildAnimals(int height, int weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }


    // @Override
    // public String makeSound() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo() + 
        ", habitat area = " + habitat + " kg" +
        ", date of discovery = " + dateDiscovery;
    }
    

}
