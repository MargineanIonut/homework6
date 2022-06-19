package ro.fasttrackit.productsapp.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.productsapp.model.Product;
import ro.fasttrackit.productsapp.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> products(@RequestParam(required = false) String category,
                                   @RequestParam(required = false) Integer maxPrice){
        return productService.products(category,maxPrice);
    }

    @GetMapping("/products/{id}")
    public Optional<Product> productsById(@PathVariable("transactionId") Integer id){
        return productService.productById(id);
    }

    @PostMapping("/products")
    public Product saveUser(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable("transactionId") Integer id){
        productService.deleteById(id);
    }
}
