package Interface2;

import Interface2.Laptop.DisplayType;
import Interface2.Laptop.MacBook;
import Interface2.Phone.IPhone;
import Interface2.TV.Oled;

public class Shopping {

    public static void main(String[] args) {

        // We can call parent class here..

        Product iphone = new IPhone("iPhone 12", 1500, Condition.NEW, Carrier.UNLOCKED);
        System.out.println(iphone);

        Product macbook = new MacBook("Mac Book Pro", 2000, Condition.OPEN_BOX, 16, "CPU", DisplayType.RETINA);
        System.out.println(macbook);

        Product oled=new Oled("Samsung OLED TV",1500,Condition.NEW,16,"Tizen",false);
        System.out.println(oled);

        System.out.println("**********************");

        ShoppingCard shoppingCard1=new ShoppingCard();

        shoppingCard1.addProduct(iphone);
        shoppingCard1.addProduct(oled);
        shoppingCard1.addProduct(macbook);
        shoppingCard1.printList();
        System.out.println("Total Price:"+shoppingCard1.totalPrice());

        shoppingCard1.removeProduct(oled);
        System.out.println("\nupdated list");
        shoppingCard1.printList();
        System.out.println("Total Price:"+shoppingCard1.totalPrice());

        System.out.println(shoppingCard1.checkOut(2500));

    }
}