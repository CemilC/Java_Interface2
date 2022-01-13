package Interface2.Laptop;

import Interface2.Condition;

public class WindowsLaptop extends AbstractLaptop {

    public WindowsLaptop(String model, double price, Condition condition, int RAM, String CPU, DisplayType displayType) {
        super(model, price, condition, RAM, CPU, displayType);
    }
}
