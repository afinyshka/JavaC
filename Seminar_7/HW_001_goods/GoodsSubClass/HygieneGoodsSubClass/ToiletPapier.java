package Seminar_7.HW_001_goods.GoodsSubClass.HygieneGoodsSubClass;

import Seminar_7.HW_001_goods.GoodsSubClass.HygieneGoods;

public class ToiletPapier extends HygieneGoods{
    public ToiletPapier(String name, int price, int amount, String unit, int itemPerPack, int amountOfLayers) {
        super(name, price, amount, unit, itemPerPack);
        this.amountOfLayers = amountOfLayers;
    }

    int amountOfLayers;

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", layers: %d.", amountOfLayers);
    }

    
    
}
