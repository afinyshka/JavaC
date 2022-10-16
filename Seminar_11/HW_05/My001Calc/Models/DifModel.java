package Seminar_11.HW_05.My001Calc.Models;

import Seminar_11.HW_05.My001Calc.Base.CalcModel;

public class DifModel extends CalcModel{

    @Override
    public double result() {
        return x - y;
    }

    @Override
    public void setX (double value) {
        super.x = value;    
    }
    
    @Override
    public void setY(double value) {
        super.y = value;   
    }

    
}
