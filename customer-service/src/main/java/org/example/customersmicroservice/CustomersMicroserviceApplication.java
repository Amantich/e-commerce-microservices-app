package org.example.customersmicroservice;

import org.example.customersmicroservice.entities.Customer;
import org.example.customersmicroservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomersMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersMicroserviceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {

            customerRepository.save(new Customer(null,"john dow","john@email.com"));
            customerRepository.save(new Customer(null, "John Doe", "john.doe@email.com"));
            customerRepository.save(new Customer(null, "Jane Smith", "jane.smith@email.com"));
            customerRepository.save(new Customer(null, "Alice Johnson", "alice.johnson@email.com"));
            customerRepository.save(new Customer(null, "Bob Brown", "bob.brown@email.com"));
            customerRepository.save(new Customer(null, "Charlie Davis", "charlie.davis@email.com"));
            customerRepository.save(new Customer(null, "Diana Evans", "diana.evans@email.com"));
            customerRepository.save(new Customer(null, "Eve Foster", "eve.foster@email.com"));
            customerRepository.save(new Customer(null, "Frank Green", "frank.green@email.com"));
            customerRepository.save(new Customer(null, "Grace Harris", "grace.harris@email.com"));
            customerRepository.save(new Customer(null, "Hank Irving", "hank.irving@email.com"));



        };
    }

}
