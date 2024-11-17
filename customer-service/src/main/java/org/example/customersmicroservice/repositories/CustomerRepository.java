package org.example.customersmicroservice.repositories;

import org.example.customersmicroservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author tensa
 **/
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
