package org.example.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tensa
 **/
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
    private Long id;
    private String name;
    private String email;
}
