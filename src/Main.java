import java.util.ArrayList;

public class Main {

    static ArrayList<Product>products = new ArrayList<>();
    public static void main(String[] args) {
        products.add(new Product("과자", 1000));
        products.add(new Product("사탕", 500));
        System.out.println(totalPriceForProducts());
    }

    public static int totalPriceForProducts(){
        int totalPrice = 0;
        for(Product product: products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}