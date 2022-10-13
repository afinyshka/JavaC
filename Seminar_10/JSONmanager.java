package Seminar_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JSONmanager {
    public String path;
//    public String data;

    public JSONmanager(String path) {
        this.path = path;
    }

    public <E> String mutogen(E input) {
        return path;
    }

    public <E> void write(E data, boolean append) throws IOException {
        FileWriter writer = new FileWriter(this.path, append);
        {
            // запись всей строки
            writer.append('\n');
            writer.write('"' + data.toString() + '"');
            // запись по символам
            writer.append('\n');
//            writer.append('E');
            writer.flush();
        }
    }
    public void read() throws FileNotFoundException {

        try(FileReader reader = new FileReader(this.path)) {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0) {

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
