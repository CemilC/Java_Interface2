package Interface2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private final List<Product>productList=new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }

    public void printList(){ // print model + price , In this point we can nat reach model directly
        // to reach model we can create method in Interface class and override it in abstractdevice class and reach it.

        for (Product product : productList) {
            System.out.println(product.getModel()+":$"+product.getPrice());
        }
    }
    public double totalPrice(){

        int sum=0;

        for (Product product : productList) {
            sum+=product.getPrice();
        }
        return  sum;
    }
    public String checkOut(double money){

        double diff=totalPrice()-money;

        if(money>=totalPrice()){
            return "You have enough money to checkOut..";
        }else {
           return "Your balance is not enough to checkout , you need "+diff+"$ to complete checkOut";

        }
    }

}
