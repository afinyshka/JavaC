package Seminar_11.HW_05.My001Calc.Base;

import java.util.List;

import Seminar_11.HW_05.My001Calc.Models.SumModel;
import Seminar_11.HW_05.My001Calc.Interfaces.IChoosingAction;
import Seminar_11.HW_05.My001Calc.Interfaces.IModel;
import Seminar_11.HW_05.My001Calc.Models.DifModel;
import Seminar_11.HW_05.My001Calc.Models.DivModel;
import Seminar_11.HW_05.My001Calc.Models.ProdModel;

public class ChoseModelFactory implements IChoosingAction {

    @Override
    public IModel chooseModel(String sign, List<Double> operandList) {
        IModel myAction = null;
        switch (sign) {
            case "*" -> myAction = new ProdModel();
            case "/" -> myAction = new DivModel();
            case "+" -> myAction = new SumModel();
            case "-" -> myAction = new DifModel();
        }
        myAction.setX(operandList.get(0));
        myAction.setY(operandList.get(1));
        return myAction;
    }

}
