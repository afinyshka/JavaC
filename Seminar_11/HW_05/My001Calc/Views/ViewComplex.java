package Seminar_11.HW_05.My001Calc.Views;

import java.util.Scanner;

import Seminar_11.HW_05.My001Calc.Interfaces.IViewComplex;

public class ViewComplex implements IViewComplex{
    Scanner sc = new Scanner(System.in);

    public String getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public String showResult(String stringName ) {
        if (stringName.contains("+ -")) {
            stringName = stringName.replace("+ -", "+ (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("- -")) {
            stringName = stringName.replace("- -", "- (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("* -")) {
            stringName = stringName.replace("* -", "* (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("/ -")) {
            stringName = stringName.replace("/ -", "/ (-");
            stringName = stringName.replace(" =", ") =");
        }
        System.out.printf("%s\n", stringName);
        return stringName;
    }
    
}
