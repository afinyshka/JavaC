package Seminar_11.HW_05.My001Calc.Logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Seminar_11.HW_05.My001Calc.Interfaces.ILogger;

import java.io.IOException;

public class SimpleLogger implements ILogger{
    protected Logger logger;
    protected FileHandler fh;
    protected SimpleFormatter sFormat;

    public Logger getLog () throws IOException {
        this.logger = Logger.getAnonymousLogger();
        // this.logger = Logger.getLogger(className);
        this.fh = new FileHandler(
                "Seminar_11/HW_05/My001Calc/Logging/LogData/logCalc.txt");
        logger.addHandler(fh);
        // SimpleFormatter sFormat = new SimpleFormatter();
        // fh.setFormatter(sFormat);
        // logger.info(myText);
        return logger;
    }

    public void log(String myText) {
        this.sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(myText);
    }

    public void log(String className,String methodName, String message){
        this.sFormat = new SimpleFormatter();
        this.fh.setFormatter(sFormat);
        logger.logp(Level.INFO, className, methodName, message);
    }
    
}
