package Seminar_11.HW_05.My001Calc.Models;

public class ProdModel extends CalcModel{
    @Override
    public int result() {
        return x * y;
    }

    @Override
    public void setX (int value) {
        super.x = value;    
    }

    @Override
    public void setY(int value) {
        super.y = value;   
    }

}