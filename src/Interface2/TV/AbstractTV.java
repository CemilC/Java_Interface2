package Interface2.TV;

import Interface2.AbstractDevice;
import Interface2.Condition;
import Interface2.Product;

public abstract class AbstractTV extends AbstractDevice implements Product {

    private double diagonal;
    private String os;
    private boolean smart;

    public AbstractTV(String model, double price, Condition condition,double diagonal,String os,boolean smart) {
        super(model, price, condition);
        this.diagonal=diagonal;
        this.os=os;
        this.smart=smart;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\ndiagonal=" + diagonal +
                "\nos=" + os +
                "\nsmart=" + smart ;

    }
}
