package org.example.billingservice.feign;

import org.example.billingservice.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tensa
 **/
@FeignClient(name="inventory-service")
public interface InventoryServiceClient {

    @GetMapping("/inventories/{id}")
    Product findProductById(@PathVariable Long id);

    @GetMapping("/inventories")
    PagedModel<Product> findAllProducts();

}
