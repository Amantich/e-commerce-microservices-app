package org.example.inventory;

import org.example.inventory.entities.Inventory;
import org.example.inventory.repositories.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }



    @Bean
    CommandLineRunner start(InventoryRepository repository) {
        return args -> {
            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("tablet")
                    .description("High-performance tablet")
                    .price(150.00)
                    .quantity(15)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("laptop")
                    .description("Lightweight and powerful")
                    .price(750.00)
                    .quantity(10)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("headphones")
                    .description("Noise-cancelling")
                    .price(50.00)
                    .quantity(25)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("smartwatch")
                    .description("Fitness tracker included")
                    .price(100.00)
                    .quantity(30)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("gaming console")
                    .description("Next-gen gaming")
                    .price(300.00)
                    .quantity(5)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("external hard drive")
                    .description("1TB storage")
                    .price(60.00)
                    .quantity(20)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("bluetooth speaker")
                    .description("Portable and waterproof")
                    .price(40.00)
                    .quantity(15)
                    .build());

            repository.save(Inventory.builder()
                    .id(UUID.randomUUID().toString())
                    .name("digital camera")
                    .description("High-resolution photos")
                    .price(200.00)
                    .quantity(8)
                    .build());


        };
    }

}
