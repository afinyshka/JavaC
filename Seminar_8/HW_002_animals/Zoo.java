package Seminar_8.HW_002_animals;

import java.util.ArrayList;

import Seminar_8.HW_002_animals.Animals.Birds;
import Seminar_8.HW_002_animals.Interfaces.IAffectionable;
import Seminar_8.HW_002_animals.Interfaces.ITrainable;

public class Zoo {
    private ArrayList<Animal> zooList;

    public Zoo() {
        this.zooList = new ArrayList<>();
    }

    String noText = "There is no animal with given index = ";

    public void addAnimal(Animal... args) { // add few Animal
        for (Animal a : args) {
            this.zooList.add(a);
        }
    }

    public void removeAnimal(int index) {
        if (index < this.zooList.size()) {
            this.zooList.remove(index);
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAnimalInfo(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" %s's info:\n", this.zooList.get(index).getClass().getSimpleName());
            System.out.println(this.zooList.get(index).getInfo());
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalSound(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" %s says:\n", this.zooList.get(index).getClass().getSimpleName());
            this.zooList.get(index).makeSound();
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalFly(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof Birds) {
                System.out.printf(" does:\n");
                ((Birds) this.zooList.get(index)).fly();
            } else {
                System.out.printf("s can't fly!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalTrain(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof ITrainable) {
                System.out.printf(" can be trained:\n");
                ((ITrainable) this.zooList.get(index)).getTrained();
            } else {
                System.out.printf("s can't be trained!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalShowAffection(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof IAffectionable) {
                System.out.printf(" shows his affection:\n");
                ((IAffectionable) this.zooList.get(index)).showAffection();
            } else {
                System.out.printf("s can't show affection!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAllAnimalsInfo() {
        System.out.println("   Zoo info:");
        for (int i = 0; i < this.zooList.size(); i++) {
            getAnimalInfo(i);
        }
    }

    public void makeAllAnimalsSound() {
        System.out.println("   Zoo sounds:");
        for (Animal item : this.zooList) {
            item.makeSound();
        }
    }

    public void makeAllAnimalFly() {
        System.out.println("   Zoo flyes:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalFly(i);
        }
    }

    public void makeAllAnimalTrain() {
        System.out.println("   Zoo trains:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalTrain(i);
        }
    }

    public void makeAllAnimalShowAffection() {
        System.out.println("   Zoo shows affection:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalShowAffection(i);
        }
    }

}
