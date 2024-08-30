import java.util.ArrayList;

public class ProductMgmtSystem {
    ArrayList<Product>products;

    public ProductMgmtSystem() {
        this.products = new ArrayList<>();
    }

    public int totalPriceForProducts(){
        int totalPrice = 0;
        for(Product product: products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
