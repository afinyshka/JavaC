package Seminar_7.HW_001_goods.GoodsSubClass.ChildsGoodsSubClass;

import Seminar_07.HW_001_goods.GoodsSubClass.ChildsGoods;

public class Diapers extends ChildsGoods {
    String size;
    int minWeight;
    int maxWeight;

    public Diapers(String name, int price, int amount, String unit, int minAge, Boolean hypoallergenic, String size,
            int minWeight, int maxWeight) {
        super(name, price, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", size: %s, weight: %d - %d kg.", size, minWeight, maxWeight);
    }
}
