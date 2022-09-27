package Seminar_7.HW_001_goods.GoodsSubClass.ChildsGoodsSubClass;

import Seminar_07.HW_001_goods.GoodsSubClass.ChildsGoods;

public class Dummy extends ChildsGoods {

    public Dummy(String name, int price, int amount, String unit, int minAge, Boolean hypoallergenic) {
        super(name, price, amount, unit, minAge, hypoallergenic);
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ".";
    }
}
