package Seminar_7.HW_001_goods.GoodsSubClass;

import Seminar_07.HW_001_goods.Goods;

public class HygieneGoods extends Goods{
    int itemPerPack;

    public HygieneGoods(String name, int price, int amount, String unit, int itemPerPack) {
        super (name, price, amount, unit);
        this.itemPerPack = itemPerPack;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", items per pack: %d", itemPerPack);
    }
    
}
