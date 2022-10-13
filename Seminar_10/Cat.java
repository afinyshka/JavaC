package Seminar_10;

public class Cat {
    protected int height;
    protected int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ",weight=" + weight;
    }
}
