package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Week2Refresher {


    @GetMapping("/products")
    public List<Product> getProductlist()
    {
        return "";
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        return product;
    }
}
