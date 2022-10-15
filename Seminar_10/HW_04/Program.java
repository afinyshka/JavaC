package Seminar_10.HW_04;

import java.io.IOException;

import Seminar_10.HW_04.Classes.Cat;
import Seminar_10.HW_04.JSONManager.JSONmanager;

public class Program {

    public static void main(String[] args) throws IOException {
        JSONmanager m = new JSONmanager("Seminar_10/HW_04/data/file.json");
        String myString = "Hello world!";
        m.write(myString, true);
        int myNumber = 14;
        m.write(myNumber, true);
        Cat myCat = new Cat("Pushok", 36, 6, "grey");
        m.write(myCat, true);

        var outStr= m.read();
        System.out.printf("It's a %s class:\n",outStr.getClass().getSimpleName());
        System.out.println(outStr);
        
    }
}