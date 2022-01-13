package Interface2.Phone;

import Interface2.Carrier;
import Interface2.Condition;

public class AndroidPhone extends AbstractPhone {

    public AndroidPhone(String model, double price, Condition condition, Carrier carrier) {
        super(model, price, condition, carrier);
    }

}
