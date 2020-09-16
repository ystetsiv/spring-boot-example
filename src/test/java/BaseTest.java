import com.stetsiv.lsjpa.Container;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@EnableAutoConfiguration
@ContextConfiguration(classes = {Container.class})
@EnableJpaRepositories(basePackages = { "com.stetsiv.lsjpa.repository"})
@EntityScan("com.stetsiv.lsjpa.entity")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BaseTest extends AbstractTestNGSpringContextTests {
}
