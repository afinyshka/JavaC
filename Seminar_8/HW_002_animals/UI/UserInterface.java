package Seminar_8.HW_002_animals.UI;

import java.util.Scanner;

import Seminar_8.HW_002_animals.Animals.SubBirds.Hen;
import Seminar_8.HW_002_animals.Animals.SubBirds.Stork;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Cat;
import Seminar_8.HW_002_animals.Animals.SubDomesticAnimals.Dog;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Tiger;
import Seminar_8.HW_002_animals.Animals.SubWildAnimals.Wolf;
import Seminar_8.HW_002_animals.*;

public class UserInterface {
    private static boolean loop = true;
    // CreaterAnimal ca;

    public void consoleUI() {
        Zoo zoo = new Zoo();

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
        // zoo.addAnimal(wolf1);
        // zoo.addAnimal(cat1, dog1, stork1, hen1, tiger1);

        String infoText = """
                \nPress the number for the command:
                1 - add an animal;
                2 - delete an animal at a specific index;
                3 - show information about all animals in the zoo;
                4 - show information about animal at a specific index;
                5 - play all animals in the zoo sounds;
                6 - play an animal's sound at a specific index;
                7 - make all animals in the zoo fly;
                8 - make an animal at a specific index fly;
                9 - make all animals in the zoo show their affection;
                10 - make an animal at a specific index show its affection;
                11 - train all animals in the zoo;
                12 - train an animal at a specific index;
                0 - exit.
                """;
        Scanner cs = new Scanner(System.in);
        // System.out.print(infoText);
        while (loop) {
            if (zoo.zooList.size() > 0) {
                loop = true;
                System.out.print(infoText);
                System.out.print("\nEnter the command or enter 0 to exit: ");
                int myChoice = cs.nextInt();
                switch (myChoice) {
                    case 1 -> addCreatedAnimal(zoo);
                    case 2 -> {
                        int i = inputNumber(zoo, cs);
                        System.out.printf("\n--- %s is removed from the zoo! ---\n",
                                zoo.zooList.get(i).getClass().getSimpleName());
                        zoo.removeAnimal(i);
                    }
                    case 3 -> zoo.getAllAnimalsInfo();
                    case 4 -> zoo.getAnimalInfo(inputNumber(zoo, cs));
                    case 5 -> zoo.makeAllAnimalsSound();
                    case 6 -> zoo.makeAnimalSound(inputNumber(zoo, cs));
                    case 7 -> zoo.makeAllAnimalFly();
                    case 8 -> zoo.makeAnimalFly(inputNumber(zoo, cs));
                    case 9 -> zoo.makeAllAnimalShowAffection();
                    case 10 -> zoo.makeAnimalShowAffection(inputNumber(zoo, cs));
                    case 11 -> zoo.makeAllAnimalTrain();
                    case 12 -> zoo.makeAnimalTrain(inputNumber(zoo, cs));
                    case 0 -> {
                        cs.close();
                        loop = false;
                    }
                    default -> System.out.println("you entered the wrong command. Choose command from the above list.");
                }
            } else {
                loop = true;
                System.out.print("\nThe zoo is empty, the only thing you can do is to add an animal or quit:\n1 - create and add an animal;\n0 - exit.");
                System.out.print("\nEnter the command or enter 0 to exit: ");
                int myChoice = cs.nextInt();
                switch (myChoice) {
                    case 1 -> addCreatedAnimal(zoo);
                    case 0 -> {
                        cs.close();
                        loop = false;
                    }
                    default ->
                        System.out.println("you entered the wrong command. Choose command from the above list.");
                }
            }
        }
    }

    public static int inputNumber(Zoo zoo, Scanner cs) {
        int indexLength = zoo.zooList.size();
        System.out.printf("Enter the index from 0 to %d: ", indexLength - 1);
        int index = cs.nextInt();
        return index;
    }

    public void addCreatedAnimal(Zoo zoo) {
        CreaterAnimal ca = new CreaterAnimal();
        boolean cycle = true;
        Scanner cs = new Scanner(System.in);
        System.out.print("""
                Choose an animal to create:
                0 - exit;
                1 - cat;
                2 - dog;
                3 - tiger;
                4 - wolf;
                5 - stork;
                6 - hen;
                """);
        while (cycle) {
            System.out.print("\nEnter animal's number or enter 0 to quit the animal-creater menu: ");
            int num = cs.nextInt();
            switch (num) {
                case 0 -> {
                    cycle = false;
                    // cs.close();
                }
                case 1 -> zoo.addAnimal(ca.animalCreater("cat"));
                case 2 -> zoo.addAnimal(ca.animalCreater("dog"));
                case 3 -> zoo.addAnimal(ca.animalCreater("tiger"));
                case 4 -> zoo.addAnimal(ca.animalCreater("wolf"));
                case 5 -> zoo.addAnimal(ca.animalCreater("stork"));
                case 6 -> zoo.addAnimal(ca.animalCreater("hen"));
                default -> System.out.println("You entered the wrong number. Try again: ");
            }
            System.out.println("\n+++ A new animal is succesfully created and added to the zoo! +++");
        }
    }
}
