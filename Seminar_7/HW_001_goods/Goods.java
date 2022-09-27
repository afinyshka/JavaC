package Seminar_7.HW_001_goods;

/*
 * Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения
 */
public class Goods {
    protected String name;
    protected int price;
    protected int amount;
    protected String unit;

    public Goods(String name, int price, int amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public Goods(String string, int i, int j, String string2, int k, boolean b) {
    }

    public String getName () {
        return name;
    }

    public int getPrice () {
        return price;
    }

    public int getAmount () {
        return amount;
    }

    public String getUnit () {
        return unit;
    }

    public String getInfo() {
        return String.format("name: %s; price: %d rub.; amount: %d %s; ", name, price, amount, unit);
    }

    @Override
    public String toString() {
        return getInfo();
    }


}
