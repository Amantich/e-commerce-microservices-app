package org.example.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;


/**
 * @author tensa
 **/
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate billingDate;
    private Long customerId;
    @Transient
    private Customer customer;
    @OneToMany
    private Collection<ProductItem> productItems;
}
