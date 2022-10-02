package Seminar_8.HW_002_animals;

import java.util.ArrayList;

import Seminar_8.HW_002_animals.Zoo;
import Seminar_8.HW_002_animals.Animals.Birds;
import Seminar_8.HW_002_animals.Animals.SubBirds.Hen;
import Seminar_8.HW_002_animals.Animals.SubBirds.Stork;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Cat;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Dog;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Tiger;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Wolf;
import Seminar_8.HW_002_animals.Interfaces.IAffectionable;
import Seminar_8.HW_002_animals.Interfaces.ITrainable;

public class Program {
    public static void main(String[] args) {
        Animal hen1 = new Hen(30, 2, "green");

        Animal stork1 = new Stork(75, 8, "blue", 300);

        Animal tiger1 = new Tiger(115, 230, "yellow",
                "Siberia", "12.07.2019");

        Animal wolf1 = new Wolf(95, 55, "green",
                "forest", "23.01.2008", true);

        Animal cat1 = new Cat(40, 4, "green", "Pushok", "pers",
                true, "light brown", "31.08.2020", true);

        Animal dog1 = new Dog(76, 8, "brown", "Cooper", "homeless",
                false, "brown, white", "12.12.2090", false);

        // for (Animal animalItem : animalList) {
        // System.out.println(" " + animalItem.getClass().getSimpleName() + " info: ");
        // System.out.println(animalItem.getInfo());
        // animalItem.makeSound();
        // if (animalItem instanceof Birds) {
        // ((Birds) animalItem).fly();
        // }
        // if (animalItem instanceof ITrainable) {
        // ((ITrainable) animalItem).getTrained();
        // }
        // if (animalItem instanceof IAffectionable) {
        // ((IAffectionable) animalItem).showAffection();
        // }
        // if (animalItem instanceof Wolf) {
        // ((Wolf) animalItem).getPackLeader();
        // }
        // }

        System.out.println(cat1.getClass());

        Zoo zooList = new Zoo();
        zooList.addAnimal(wolf1);
        zooList.addAnimal(cat1, dog1, stork1, hen1, tiger1);
        zooList.makeAnimalFly(2);
        zooList.makeAnimalTrain(2);
        zooList.makeAnimalShowAffection(2);
        zooList.getAnimalInfo(6);
        zooList.makeAllAnimalsSound();
        zooList.getAllAnimalsInfo();
        zooList.makeAllAnimalFly();
        zooList.makeAllAnimalShowAffection();
        zooList.makeAllAnimalTrain();
    }
}
