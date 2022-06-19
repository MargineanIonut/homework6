package ro.fasttrackit.productsapp.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.productsapp.model.Product;
import ro.fasttrackit.productsapp.repository.ProductRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> products(String category, Integer maxPrice) {
        return productRepository.findAll().stream()
                .filter(product -> !Objects.equals(String.valueOf(product.getCategory()), category))
                .filter(product -> product.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public Optional<Product> productById(Integer id) {
        return productRepository.findAll().stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Integer id) {
         productRepository.deleteById(id);
    }
}
