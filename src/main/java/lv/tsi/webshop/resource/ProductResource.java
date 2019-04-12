package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.ProductCategory;
import lv.tsi.webshop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ProductResource {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = ("/all/", "/all/{productCategory}"))
    public @ResponseBody List<Product> getProducts(@PathVariable optional<ProductCategory>){
        return productRepository.findAll();
    }
}
