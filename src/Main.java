import java.util.ArrayList;

public class Main {

    static ProductMgmtSystem productMgmtSystem = new ProductMgmtSystem();
    public static void main(String[] args) {
        productMgmtSystem.addProduct(new Product("과자", 1000));
        productMgmtSystem.addProduct(new Product("사탕", 500));
        System.out.println(productMgmtSystem.totalPriceForProducts());

        Multiplication multiplication = new Multiplication();
        multiplication.Level2print();
        multiplication.Level3print();
        multiplication.Level4print();
    }
}