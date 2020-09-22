import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.entity.ProductCategory;
import com.stetsiv.lsjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class ProductTest extends BaseTest {

    @Autowired
    private ProductService productService;

    @Test
    public void saveProduct(){
        Product product = new Product();

        product.setId(Long.valueOf(randomNumeric(5)));
        product.setName("Macbook Pro laptop");
        product.setPrice(1234.89);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setName("laptop");

        product.setProductCategory(productCategory);
        productService.saveWithAudit(product);

    }
}
