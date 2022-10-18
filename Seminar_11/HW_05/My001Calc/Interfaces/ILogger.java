package Seminar_11.HW_05.My001Calc.Interfaces;

import java.io.IOException;
import java.util.logging.Logger;

public interface ILogger {
    public Logger getLog (String className) throws IOException;
    public void log(String myText);
}
