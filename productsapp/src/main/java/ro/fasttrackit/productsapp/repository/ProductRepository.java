package ro.fasttrackit.productsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.productsapp.model.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
