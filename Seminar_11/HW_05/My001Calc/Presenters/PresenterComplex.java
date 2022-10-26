package Seminar_11.HW_05.My001Calc.Presenters;

import java.util.ArrayList;
import java.util.List;

import Seminar_11.HW_05.My001Calc.Complex.Complex;
import Seminar_11.HW_05.My001Calc.Complex.ComplexCreater;
import Seminar_11.HW_05.My001Calc.Interfaces.IChoosingComplexFactory;
import Seminar_11.HW_05.My001Calc.Interfaces.ILogger;
import Seminar_11.HW_05.My001Calc.Interfaces.IViewComplex;

public class PresenterComplex {
    private IViewComplex viewComplex;
    private IChoosingComplexFactory modelComplex;
    private ILogger loggerComplex;

    public PresenterComplex(IViewComplex viewComplex, IChoosingComplexFactory modelComplex, ILogger loggerComplex) {
        this.viewComplex = viewComplex;
        this.modelComplex = modelComplex;
        this.loggerComplex = loggerComplex;
    }

    public void buttonClickComplex() {
        ComplexCreater myComplex = new ComplexCreater();
        Complex a = myComplex.createComplex(viewComplex.getValue("first operand in format '0.0+0.0i'"));
        String sign = viewComplex.getSign("Enter one of the signs: '*, /, +, - '");
        Complex b = myComplex.createComplex(viewComplex.getValue("second operand in format '0.0+0.0i'"));
        List<Complex> operandList = new ArrayList<>();
        operandList.add(a);
        operandList.add(b);
        Complex result = modelComplex.chooseModelComplex(sign, operandList).result();
        String resString = String.format("%s %s %s = %s", a.toString(), sign, b.toString(), result.toString());
        resString = viewComplex.showResult(resString);
        loggerComplex.log(PresenterComplex.class.getSimpleName(), "buttonClickComplex", resString);
    }

}
