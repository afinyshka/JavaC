package Seminar_7.HW_001_goods.GoodsSubClass.DrinksSubClass;

import Seminar_07.HW_001_goods.GoodsSubClass.Drinks;

public class Milk extends Drinks{
    Double fats;
    String expDate;

    public Milk (String name, int price, int amount, String unit, int volume, Double fats, String expDate) {
        super (name, price, amount, unit, volume);
        this.fats = fats;
        this.expDate = expDate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", fats: %f percents, expire date: %s.", fats, expDate);
    }

}
