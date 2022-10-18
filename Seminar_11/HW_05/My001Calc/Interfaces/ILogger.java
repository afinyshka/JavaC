package Seminar_11.HW_05.My001Calc.Interfaces;

import java.io.IOException;
import java.util.logging.Logger;

public interface ILogger {
    public Logger getLog () throws IOException;
    public void log(String myText);
    public void log(String string, String string2, String string3);
}
