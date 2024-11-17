package org.example.billingservice;

import org.example.billingservice.entities.Bill;
import org.example.billingservice.entities.Customer;
import org.example.billingservice.entities.ProductItem;
import org.example.billingservice.feign.CustomerServiceClient;
import org.example.billingservice.feign.InventoryServiceClient;
import org.example.billingservice.repositories.BillRepository;
import org.example.billingservice.repositories.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

@Bean
    CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository,
                            InventoryServiceClient inventoryServiceClient, CustomerServiceClient customerServiceClient){

return args -> {

    Bill bill=new Bill();
    bill.setBillingDate(LocalDate.now());
    Customer customer=customerServiceClient.findCustomerById(1L);

    bill.setCustomerId(customer.getId());
    billRepository.save(bill);

    inventoryServiceClient.findAllProducts().getContent().forEach(p->{

        productItemRepository.save(
              ProductItem.builder()
                      .quantity((int)(Math.random()*20))
                      .price((int)(Math.random()*100))
                      .bill(bill)
                      .build()

        );

    });

};
    }
}
