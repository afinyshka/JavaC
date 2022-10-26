package Seminar_11.HW_05.My001Calc.ModelsComplex;

import Seminar_11.HW_05.My001Calc.BaseComplex.CalcModelComplex;
import Seminar_11.HW_05.My001Calc.Complex.Complex;

public class DivModelComplex extends CalcModelComplex {
    protected Complex a; // = new Complex(x,y); x + y * i
    protected Complex b;

    @Override
    public Complex result() {
        return new Complex((super.a.getX() * super.b.getX()) + (super.a.getY() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY())
                + (super.a.getY() * super.b.getX()) + (super.a.getX() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY()));
    }

    @Override
    public void setA(Complex a) {
        super.a = a;
    }

    @Override
    public void setB(Complex b) {
        super.b = b;
    }
    
}
