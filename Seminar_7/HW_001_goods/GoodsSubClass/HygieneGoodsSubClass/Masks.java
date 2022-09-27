package Seminar_7.HW_001_goods.GoodsSubClass.HygieneGoodsSubClass;

import Seminar_07.HW_001_goods.GoodsSubClass.HygieneGoods;

public class Masks extends HygieneGoods{

    public Masks(String name, int price, int amount, String unit, int itemPerPack) {
        super(name, price, amount, unit, itemPerPack);
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ".";
    }
    
}
