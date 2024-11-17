package org.example.inventory.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tensa
 **/
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Inventory {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
