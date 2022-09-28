package Seminar_8.HW_002_animals;

import Seminar_8.HW_002_animals.SubAnimals.Birds;
import Seminar_8.HW_002_animals.SubAnimals.WildAnimals;
import Seminar_8.HW_002_animals.SubAnimals.SubBirds.Hen;
import Seminar_8.HW_002_animals.SubAnimals.SubBirds.Stork;
import Seminar_8.HW_002_animals.SubAnimals.SubWildAnimals.Tiger;

public class Program {
    public static void main(String[] args) {
        Animal hen1 = new Hen(30, 2, "green");
        System.out.println("   " + hen1.getClass().getSimpleName() + " info: ");
        System.out.println(hen1.getInfo());
        System.out.println(((Birds) hen1).fly()); // to add fly() method
        System.out.println(hen1.makeSound());

        Animal stork1 = new Stork (75, 8, "blue", 300);
        System.out.println("   " + stork1.getClass().getSimpleName() + " info: ");
        System.out.println(stork1.toString());
        System.out.println(((Birds) stork1).fly()); // to add fly() method
        System.out.println(stork1.makeSound());
        hen1.height = 5;
        System.out.println(hen1.getInfo());

        Animal tiger1 = new Tiger(115, 230, "yellow", "Siberia", "12.07.2019");
        System.out.println("   " + tiger1.getClass().getSimpleName() + " info: ");
        System.out.println(tiger1.getInfo());
        System.out.println(tiger1.makeSound());
        

    }
}
