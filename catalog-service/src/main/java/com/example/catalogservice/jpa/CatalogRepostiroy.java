package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepostiroy extends CrudRepository<CatalogEntity, Long> {
    CatalogEntity findByProductId(String productId);
}
