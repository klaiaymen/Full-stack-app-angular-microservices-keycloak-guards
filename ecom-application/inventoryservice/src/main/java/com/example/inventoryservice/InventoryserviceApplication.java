package com.example.inventoryservice;

import com.example.inventoryservice.models.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryserviceApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Mohamed")
                    .price("med@gmail.com")
                    .build());
            productRepository.save(Product.builder()
                    .name("Yassine")
                    .price("yassine@gmail.com")
                    .build());
            productRepository.save(Product.builder()
                    .name("Imane")
                    .price("imane@gmail.com")
                    .build());
        };
    }
}
