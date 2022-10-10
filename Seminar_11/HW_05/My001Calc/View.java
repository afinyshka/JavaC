package Seminar_11.HW_05.My001Calc;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public int getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.nextInt();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public void showResult(String stringName ) {
        System.out.printf("%s\n", stringName); 
    }

}
