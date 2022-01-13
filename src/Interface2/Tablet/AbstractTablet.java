package Interface2.Tablet;

import Interface2.AbstractDevice;
import Interface2.Condition;
import Interface2.Product;

public abstract class AbstractTablet extends AbstractDevice implements Product {

    private boolean pen;

    public AbstractTablet(String model, double price, Condition condition) {
        super(model, price, condition);
    }

    public boolean hasPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
}
