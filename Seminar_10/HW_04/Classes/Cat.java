package Seminar_10.HW_04.Classes;

public class Cat {
    protected String name;
    protected int height;
    protected int weight;
    protected String color;



    public Cat(String name, int height, int weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public String toJSONString() {
        return String.format("{\"name\": \"%s\", \"height\": %d, \"weight\": %d, \"color\": \"%s\"}", name, height, weight, color);
    }

    @Override
    public String toString() {
        return String.format("name: %s, height: %d, weight: %d, color: %s", name, height, weight, color);
    }


}
