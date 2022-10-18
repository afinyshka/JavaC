package Seminar_11.HW_05.My001Calc;

import java.io.IOException;

import Seminar_11.HW_05.My001Calc.Base.ChoseModelFactory;
import Seminar_11.HW_05.My001Calc.Interfaces.ILogger;
import Seminar_11.HW_05.My001Calc.Logging.SimpleLogger;

public class Program {
    
    public static void main(String[] args) throws IOException {
        ILogger logger = new SimpleLogger();
        Presenter pres = new Presenter (new View(), new ChoseModelFactory(), logger);
        logger.getLog(Program.class.getSimpleName());
        logger.log("the program is started");

        pres.buttonClick();
        pres.buttonClick();

        logger.log("the program is finished");
    }
}
