package Interface2.Phone;

import Interface2.AbstractDevice;
import Interface2.Carrier;
import Interface2.Condition;
import Interface2.Product;

public abstract class AbstractPhone extends AbstractDevice implements Product {

    private Carrier carrier;

    public AbstractPhone(String model, double price, Condition condition,Carrier carrier) {
        super(model, price, condition);
        this.carrier= carrier;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCarrier:"+carrier;
    }
}