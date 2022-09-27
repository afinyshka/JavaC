package Seminar_7.HW_001_goods.GoodsSubClass.FoodStuffSubClass;

import Seminar_7.HW_001_goods.GoodsSubClass.Foodstuff;

public class Bread  extends Foodstuff{
    String flourType;

    public Bread(String name, int price, int amount, String unit, String expDate, String flourType ) {
        super(name, price, amount, unit, expDate);
        this.flourType = flourType;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo() + String.format(", type of the flour: %s.", flourType);
    }
    
}
