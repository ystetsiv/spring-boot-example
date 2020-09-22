package testDoubles;

import com.stetsiv.lsjpa.entity.Product;
import com.stetsiv.lsjpa.repository.ProductRepository;
import com.stetsiv.lsjpa.service.ProductAuditService;
import com.stetsiv.lsjpa.service.ProductService;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;


public class MockExampleTest {


    @Mock
    private ProductAuditService productAuditService;

    @Mock
    private ProductRepository productRepository;


    @BeforeClass
    public void beforeClass(){
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void mockTest(){

        Product product = new Product();
        //stub
        when(productRepository.save(product)).thenReturn(product);

        ProductService productService = new ProductService(productRepository, productAuditService);
        productService.saveWithAudit(product);

        //mock
        Mockito.verify(productAuditService).logProduct(product);
    }

    @Test
    public void mockTest2(){
        Product product = new Product();

        ProductService productService = new ProductService(productRepository);
        productService.simpleSave(product);

        Mockito.verify(productRepository).save(product);
    }





}
