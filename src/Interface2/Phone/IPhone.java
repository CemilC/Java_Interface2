package Interface2.Phone;

import Interface2.Carrier;
import Interface2.Condition;

public class IPhone extends AbstractPhone {

    public IPhone(String model, double price, Condition condition, Carrier carrier) {
        super(model, price, condition, carrier);
    }
}
