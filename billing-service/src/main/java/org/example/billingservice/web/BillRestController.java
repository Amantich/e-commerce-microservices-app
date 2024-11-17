package org.example.billingservice.web;

import lombok.AllArgsConstructor;
import org.example.billingservice.entities.Bill;
import org.example.billingservice.repositories.BillRepository;
import org.example.billingservice.services.BillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tensa
 **/
@RestController
@AllArgsConstructor
public class BillRestController {

    private BillService billService;
    private BillRepository billRepository;

    @GetMapping("/bills/{id}")
    public Bill getBill(@PathVariable long id) {
        return billService.getBill(id);
    }

    @GetMapping("/bills")
    public List<Bill> getBills() {
        return billRepository.findAll();
    }
}
