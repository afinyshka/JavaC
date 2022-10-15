package Seminar_10.HW_04.Classes;

public class ObjCatCreater {

    public Cat createAnObjCat (String str) {
        str = str.substring(1, str.length() - 1);
        String [] strng = str.split(" ");
        String name = strng[1].substring(1, strng[1].length() - 2);
        Integer height = Integer.parseInt(strng[3].substring(0, strng[3].length() - 1));
        Integer weight = Integer.parseInt(strng[5].substring(0, strng[5].length() - 1));
        String color = strng[7].substring(1, strng[7].length() - 1);
        return new Cat(name, height, weight, color);
    }
}
