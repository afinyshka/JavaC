package Seminar_7.HW_001_goods.GoodsSubClass;

import Seminar_7.HW_001_goods.Goods;

/**
 * Drinks
 */
public class Drinks extends Goods {
    int volume;

    public Drinks (String name, int price, int amount, String unit, int volume) {
        super (name, price, amount, unit);
        this.volume = volume;
 
    }
    @Override
    public String getInfo() {
        return super.getInfo() + String.format("%d ml", volume);
    }
}
