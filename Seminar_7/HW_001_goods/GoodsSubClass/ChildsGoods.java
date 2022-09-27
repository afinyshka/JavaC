package Seminar_7.HW_001_goods.GoodsSubClass;

import Seminar_7.HW_001_goods.Goods;

/**
 * ChildsGoods
 */
public class ChildsGoods extends Goods {
    int minAge;
    Boolean hypoallergenic;

    public ChildsGoods(String name, int price, int amount, String unit, int minAge, Boolean hypoallergenic) {
        super (name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format("minimum age: %d+; hyppoallergenic: %b", minAge, hypoallergenic);
        
    }
}