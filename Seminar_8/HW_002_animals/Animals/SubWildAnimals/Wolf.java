package Seminar_8.HW_002_animals.Animals.SubWildAnimals;

import Seminar_8.HW_002_animals.Animals.WildAnimals;

public class Wolf extends WildAnimals {
    protected boolean packLeader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String dateDiscovery, boolean packLeader) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        this.packLeader = packLeader;
    }

    public boolean getPackLeader() {
        return this.packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("Wooo-wooo-wooo...");

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", is pack leader = " + this.packLeader + ".";
    }
    
}
