package Interface2;

public abstract class AbstractDevice implements Product {

    private String model;
    private double price;
    private Condition condition;

    public AbstractDevice(String model, double price, Condition condition) {
        this.model = model;
        this.price = price;
        this.condition = condition;
    }
    @Override
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    @Override
    public String toString() {
        return "*********************\n" +
                this.getClass().getSimpleName() +
                "\nmodel=" + this.model +
                "\nprice=" + this.price + "$" +
                "\ncondition=" + this.condition ;

    }
}
