package Seminar_7.HW_001_goods.GoodsSubClass.DrinksSubClass;

import Seminar_7.HW_001_goods.GoodsSubClass.Drinks;

public class Limonade extends Drinks {

    public Limonade (String name, int price, int amount, String unit, int volume) {
        super (name, price, amount, unit, volume);

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ".";
    }
}
