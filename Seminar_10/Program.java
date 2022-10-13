package Seminar_10;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        JSONmanager m = new JSONmanager("Seminar_10/file.json");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" world");
        // m.write(sb, true);
        m.read();
        Cat c = new Cat(36, 6);
        System.out.println(c);

        JsonFileReader reader = new JsonFileReader();
        int value = reader.readObject(int.class);
        System.out.println(value);
        String str = reader.readObject(String.class);
        System.out.println(str);
    }
}