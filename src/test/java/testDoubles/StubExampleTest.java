package testDoubles;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.entity.ProductCategory;
import com.stetsiv.lsjpa.repository.ProductCategoryRepository;
import com.stetsiv.lsjpa.service.ProductCategoryService;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StubExampleTest {


    @Test
    public void stubTest(){

        Product product = new Product();
        product.setPrice(20.2);

        Product product1 = new Product();
        product1.setPrice(100.2);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setName("test");

        productCategory.setProductSet(Arrays.asList(product, product1));


        ProductCategoryRepository productCategoryRepository = mock(ProductCategoryRepository.class);
        when(productCategoryRepository.findByName(any(String.class)))
                .thenReturn(Optional.of(productCategory));

        ProductCategoryService productCategoryService =
                new ProductCategoryService(productCategoryRepository);

        Double highestPrice = productCategoryService.getHighestPriceByCategory(productCategory.getName());



        Assert.assertEquals(product1.getPrice(), highestPrice);
    }
}
