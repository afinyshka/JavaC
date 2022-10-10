package Seminar_11.HW_05.My001Calc;

import Seminar_11.HW_05.My001Calc.Models.CalcModel;

public class Program<T> {
    
    public static void main(String[] args) {
        // var m = new CalcModel();
        // var v = new View();
        // Presenter<DifModel> pres = new Presenter(v, m);
        Presenter pres = new Presenter<CalcModel>(new View(), new CalcModel());

        pres.buttonClick();
        pres.buttonClick();
    }
}
