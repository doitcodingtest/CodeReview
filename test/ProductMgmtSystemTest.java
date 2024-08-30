import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductMgmtSystemTest {
    static ProductMgmtSystem productMgmtSystem;
    static Product normalProduct;

    @BeforeAll
    static void setUp(){
        productMgmtSystem = new ProductMgmtSystem();
        normalProduct = new Product("normal", 100);
    }
    @Test
    void successAddProductWhenNormalProduct(){
        int start = productMgmtSystem.getProducts().size();
        productMgmtSystem.addProduct(normalProduct);
        productMgmtSystem.addProduct(normalProduct);
        productMgmtSystem.addProduct(normalProduct);
        int end = productMgmtSystem.getProducts().size();
        assertEquals(start+3, end);
    }
}