package Seminar_8.HW_002_animals;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> zooList;

    public Zoo () {
        zooList = new ArrayList<>();
    }

    String noText = "There is no animal with given index = ";

    public void addAnimal(Animal... args) { // add few Animal 
        for (Animal a : args) {
        this.zooList.add(a);    
        }
    }

    public void removeAnimal(int index) {
        if (index < zooList.size()) {
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

}
