package Seminar_11.HW_05.My001Calc.Interfaces;

import java.util.List;

import Seminar_11.HW_05.My001Calc.Complex.Complex;

public interface IChoosingComplexFactory {
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList);
}
