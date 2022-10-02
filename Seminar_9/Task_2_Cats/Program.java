package Seminar_9.Task_2_Cats;

import java.util.ArrayList;
import java.util.Collection;

public class Program {
    private static void printCatList(Collection<Cat> cats){
        for(Cat cat : cats){
            System.out.println(cat);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat(100, "Barsic", 2, 2, "Black");
        Cat cat2 = new Cat(80, "Murka", 3, 5, "Gray");
        Cat cat3 = new Cat(50, "Cat", 1, 1, "White");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        printCatList(cats);
        cats.sort(null );
        printCatList(cats);
    }
    
}
