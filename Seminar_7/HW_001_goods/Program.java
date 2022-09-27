package Seminar_7.HW_001_goods;

import java.util.ArrayList;

import Seminar_7.HW_001_goods.GoodsSubClass.ChildsGoodsSubClass.Diapers;
import Seminar_7.HW_001_goods.GoodsSubClass.ChildsGoodsSubClass.Dummy;
import Seminar_7.HW_001_goods.GoodsSubClass.DrinksSubClass.Limonade;
import Seminar_7.HW_001_goods.GoodsSubClass.DrinksSubClass.Milk;
import Seminar_7.HW_001_goods.GoodsSubClass.FoodStuffSubClass.Bread;
import Seminar_7.HW_001_goods.GoodsSubClass.FoodStuffSubClass.Eggs;
import Seminar_7.HW_001_goods.GoodsSubClass.HygieneGoodsSubClass.Masks;
import Seminar_7.HW_001_goods.GoodsSubClass.HygieneGoodsSubClass.ToiletPapier;

public class Program {

    public static void main(String[] args) {

        ArrayList<Goods> tradeList = new ArrayList<>();
        tradeList.add(new Diapers("Pampers", 1590, 1, "pack", 0, true, "XS", 3, 7));
        tradeList.add(new Dummy("Dummy mummy", 349, 2, "pack", 0, true));
        tradeList.add(new Bread("White bread", 79, 1, "item", "30.09.2022", "wheat"));
        tradeList.add(new Eggs("Farmer's eggs", 150, 1, "pack", "30.09.2022", 10));
        tradeList.add(new Masks("Masks", 99, 1, "pack", 3));
        tradeList.add(new ToiletPapier("Zeva", 350, 1, "pack", 12, 3));
        tradeList.add(new Milk("33 Cows", 99, 1, "bottle", 950, 3.2, "12.04.2023"));
        tradeList.add(new Limonade("Tarkhun", 89, 1, "bottle", 750));

        System.out.println("   ***    ***   ***   ***");
        // System.out.println("Products info:\n");
        // for (Goods item : tradeList) {
        //     System.out.println(item.toString());
        // }

        PrinterList(tradeList);
        System.out.println("   ***    ***   ***   ***");
    }

    private static void PrinterList(ArrayList<Goods> nameList) {
        System.out.println("Products info:");
        for (Goods item : nameList) {
            System.out.println(item.getClass().getSimpleName() + " info:");
            System.out.println(item.toString());
        }
    }
}
