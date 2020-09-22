package testDoubles;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.entity.ProductCart;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.mockito.Mockito.mock;

public class DummyExampleTest {


    @Test
    public void dummyTest(){
       //Product testDoubles = mock(Product.class);
        Product dummy = null;

        ProductCart productCart = new ProductCart();
        productCart.addProduct(dummy);

        Assert.assertEquals(1, productCart.getNumberOfProducts());
    }
}
