package org.example.inventory.repositories;

import org.example.inventory.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author tensa
 **/
@RepositoryRestResource
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
