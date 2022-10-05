package Seminar_8.HW_002_animals;

import java.util.Scanner;

import Seminar_8.HW_002_animals.Animals.SubBirds.Hen;
import Seminar_8.HW_002_animals.Animals.SubBirds.Stork;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Cat;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Dog;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Tiger;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Wolf;

public class CreaterAnimal {
    private  Scanner ansc;

    public CreaterAnimal() {
        this.ansc = new Scanner(System.in);
    }

    public Animal animalCreater(String typeAnimal) {
        // Scanner ansc = new Scanner(System.in);
        System.out.printf("Enter %s's height (sm): ", typeAnimal);
        int height = ansc.nextInt();
        System.out.printf("Enter %s's weight (kg): ", typeAnimal);
        int weight = ansc.nextInt();
        System.out.printf("Enter %s's eyes color: ", typeAnimal);
        String eyesColor = ansc.next();
        if (typeAnimal == "cat" || typeAnimal == "dog") {
            System.out.printf("Enter %s's name: ", typeAnimal);
            String name = ansc.next();
            System.out.printf("Enter %s's breed: ", typeAnimal);
            String breed = ansc.next();
            System.out.printf("Enter %s's vaccination (true/false): ", typeAnimal);
            boolean vaccination = ansc.nextBoolean();
            System.out.printf("Enter %s's fur color: ", typeAnimal);
            String furColor = ansc.next();
            System.out.printf("Enter %s's date of birth: ", typeAnimal);
            String birthDate = ansc.next();
            if (typeAnimal == "cat") {
                System.out.printf("Enter %s's fur presence (true/false): ", typeAnimal);
                boolean hasFur = ansc.nextBoolean();
                return new Cat(height, weight, eyesColor, name, breed, vaccination, furColor, birthDate, hasFur);
            }
            if (typeAnimal == "dog") {
                System.out.printf("Enter %s's trained condition (true/false): ", typeAnimal);
                boolean isTrained = ansc.nextBoolean();
                return new Dog(height, weight, eyesColor, name, breed, vaccination, furColor, birthDate, isTrained);
            }
        }
        if (typeAnimal == "tiger" || typeAnimal == "wolf") {
            System.out.printf("Enter %s's habitat area: ", typeAnimal);
            String habitat = ansc.next();
            System.out.printf("Enter %s's date of discovery: ", typeAnimal);
            String dateDiscovery = ansc.next();
            if (typeAnimal == "tiger") {
                return new Tiger(height, weight, eyesColor, habitat, dateDiscovery);
            }
            if (typeAnimal == "wolf") {
                System.out.printf("Enter %s's pack leader condition (true/false): ", typeAnimal);
                boolean packLeader = ansc.nextBoolean();
                return new Wolf(height, weight, eyesColor, habitat, dateDiscovery, packLeader);
            }
        }
        if (typeAnimal == "hen") {
            int flyAltitude = 1;
            return new Hen(height, weight, eyesColor, flyAltitude);
        }
        if (typeAnimal == "stork") {
            System.out.printf("Enter %s's flying altitude: ", typeAnimal);
            int flyAltitude = ansc.nextInt();
            return new Stork(height, weight, eyesColor, flyAltitude);
        }
        ansc.close();
        return null;
    }


}
