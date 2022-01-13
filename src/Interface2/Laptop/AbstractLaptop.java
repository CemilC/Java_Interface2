package Interface2.Laptop;

import Interface2.AbstractDevice;
import Interface2.Condition;
import Interface2.Product;

public abstract class AbstractLaptop extends AbstractDevice implements Product {

    private int RAM;
    private String CPU;
    private DisplayType displayType;

    public AbstractLaptop(String model, double price, Condition condition,int RAM,String CPU,DisplayType displayType) {

        super(model, price,condition );
        this.RAM=RAM;
        this.CPU=CPU;
        this.displayType=displayType;
    }
    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nRAM=" + RAM +
                "\nCPU=" + CPU +
                "\ndisplayType=" + displayType;
    }
}
