package Seminar_11.HW_05.My001Calc.BaseComplex;

import java.util.List;

import Seminar_11.HW_05.My001Calc.Complex.Complex;
import Seminar_11.HW_05.My001Calc.Interfaces.IChoosingComplexFactory;
import Seminar_11.HW_05.My001Calc.Interfaces.IModelComplex;
import Seminar_11.HW_05.My001Calc.ModelsComplex.DifModelComplex;
import Seminar_11.HW_05.My001Calc.ModelsComplex.DivModelComplex;
import Seminar_11.HW_05.My001Calc.ModelsComplex.ProdModelComplex;
import Seminar_11.HW_05.My001Calc.ModelsComplex.SumModelComplex;

public class ChoseModelComplexFactory implements IChoosingComplexFactory {

    @Override
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList) {
        IModelComplex myAction = null;
        switch(sign) {
            case "*" -> myAction = new ProdModelComplex();
            case "/" -> myAction = new DivModelComplex();
            case "+" -> myAction = new SumModelComplex();
            case "-" -> myAction = new DifModelComplex();
        }
        
        myAction.setA(operandList.get(0));
        myAction.setB(operandList.get(1));
        return myAction;
    }
    
}
