package Seminar_8.HW_002_animals.SubAnimals.SubWildAnimals;

import Seminar_8.HW_002_animals.SubAnimals.WildAnimals;

public class Tiger extends WildAnimals {

    public Tiger(int height, int weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String makeSound() {
        return "Rrrr-Rrrr-Rrrr!!!";
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo();
    }
    
}
