package Seminar_11.HW_05.My001Calc.Logging;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Seminar_11.HW_05.My001Calc.Interfaces.ILogger;

import java.io.IOException;

public class SimpleLogger implements ILogger{

    public void log (String className, String myText) throws IOException {
        Logger logger = Logger.getLogger(className);
        FileHandler fh = new FileHandler(
                "/Users/user/Desktop/GB/Java_course/Seminar_11/HW_05/My001Calc/Logging/LogData/logCalc.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(myText);
    }
}
