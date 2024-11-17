package org.example.billingservice.services;

import lombok.AllArgsConstructor;
import org.example.billingservice.entities.Bill;
import org.example.billingservice.entities.Customer;
import org.example.billingservice.entities.Product;
import org.example.billingservice.feign.CustomerServiceClient;
import org.example.billingservice.feign.InventoryServiceClient;
import org.example.billingservice.repositories.BillRepository;
import org.example.billingservice.repositories.ProductItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

/**
 * @author tensa
 **/
@Service
@Transactional
@AllArgsConstructor
public class BillService {
    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerServiceClient customerServiceClient;
    private InventoryServiceClient inventoryServiceClient;


    public Bill getBill( long id) {
        Bill bill= billRepository.findById(id).orElse(null);
        Customer customer=customerServiceClient.findCustomerById(bill.getCustomerId());
        System.out.println(customer);
        bill.setCustomer(customer);
        bill.setProductItems(productItemRepository.findByBillId(bill.getId()));
//        bill.getProductItems().forEach(productItem -> {
//            productItem.setProduct(inventoryServiceClient.findProductById(productItem.getProductId()));
//        });
        return bill;
    }

}
