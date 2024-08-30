import java.util.ArrayList;

public class Main {

    ArrayList<Product>products = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int totalPriceForProducts(){
        int totalPrice = 0;
        for(Product product: products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}