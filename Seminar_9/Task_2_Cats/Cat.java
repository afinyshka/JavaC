package Seminar_9.Task_2_Cats;

public class Cat implements Comparable<Cat> {
    private int length;
    private String name;
    private int weight;
    private int age;
    private String color;
    public Cat(int length, String name, int weight, int age, String color) {
        this.length = length;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public int getLength(){
        return length;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nColor: %s\nLength: %d\nWeigth: %d\nAge: %d",name,color,length,weight,age);

    }
     @Override
    public int compareTo(Cat o) {
        
        return weight - o.weight;
    }

    
}
