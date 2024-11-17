package org.example.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tensa
 **/
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
