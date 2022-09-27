package Seminar_7.HW_001_goods.GoodsSubClass;

import Seminar_7.HW_001_goods.Goods;

public class Foodstuff extends Goods {
    String expDate;

    public Foodstuff (String name, int price, int amount, String unit, String expDate) {
        super (name, price, amount, unit);
        this.expDate = expDate;
 
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", expire date: %s.", expDate);
    }
}
