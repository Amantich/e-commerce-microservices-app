package org.example.billingservice.feign;

import org.example.billingservice.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tensa
 **/
@FeignClient(name = "customer-service")
public interface CustomerServiceClient {

    @GetMapping("/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);

    @GetMapping("/customers")
    PagedModel<Customer> findAllCustomers();

}
