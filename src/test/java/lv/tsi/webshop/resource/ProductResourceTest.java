package lv.tsi.webshop.resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductResourceTest {

    @Autowired
    private MockBean mockMvc;

    @Test

    void getAllProducts () throws Exception {
        mockMvc.perform(get(ute))
    }

}