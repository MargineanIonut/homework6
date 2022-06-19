package ro.fasttrackit.productsapp.model;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Product {

    @Id
    @GeneratedValue
    private  Integer id;
    private  String name;
    private  Integer price;
    private  Category category;



}


