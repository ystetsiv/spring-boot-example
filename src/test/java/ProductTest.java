import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import java.math.BigDecimal;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class ProductTest extends BaseTest {

    @Autowired
    private ProductService productService;


    @Test
    public void saveProduct(){
        Product product = new Product();

        product.setId(Long.valueOf(randomNumeric(5)));
        product.setName("Macbook Pro laptop");
        product.setPrice(BigDecimal.valueOf(1234.89));

        productService.save(product);
    }
}
