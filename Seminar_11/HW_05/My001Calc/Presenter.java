package Seminar_11.HW_05.My001Calc;

import Seminar_11.HW_05.My001Calc.Models.CalcModel;
import Seminar_11.HW_05.My001Calc.Models.DifModel;
import Seminar_11.HW_05.My001Calc.Models.DivModel;
import Seminar_11.HW_05.My001Calc.Models.ProdModel;
import Seminar_11.HW_05.My001Calc.Models.SumModel;

public class Presenter<T extends CalcModel> {
    View myView;
    Model myModel;

    

    public Presenter(View myView, T myModel) {
        this.myView = myView;
        this.myModel = myModel;
    }


    public void buttonClick() {
        int a = myView.getValue("first number");
        String sign = myView.getSign("math char");
        switch (sign) {
            case "*" -> new Presenter<ProdModel>(new View(), new ProdModel());
            case "/" -> new Presenter<DivModel>(new View(), new DivModel());
            case "+" -> new Presenter<SumModel>(new View(), new SumModel());
            case "-" -> new Presenter<DifModel>(new View(), new DifModel());
        }
        int b = myView.getValue("second number");
        myModel.setX(a);
        myModel.setY(b);
        int result = myModel.result();
        String resString = String.format("%d + %d = %d", a, b, result);
        myView.showResult(resString);
    }
}
