package Seminar_7.HW_001_goods.GoodsSubClass.FoodStuffSubClass;

import Seminar_07.HW_001_goods.GoodsSubClass.Foodstuff;

public class Eggs extends Foodstuff {

    int itemsPerPack;

    public Eggs(String name, int price, int amount, String unit, String expDate, int itemPerPack) {
        super(name, price, amount, unit, expDate);
        this.itemsPerPack = itemPerPack;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo() + String.format(", items per pack: %s.", itemsPerPack);
    }

}
