package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import com.example.catalogservice.jpa.CatalogRepostiroy;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService{
    private CatalogRepostiroy catalogRepostiroy;

    @Autowired
    public CatalogServiceImpl(CatalogRepostiroy catalogRepostiroy) {
        this.catalogRepostiroy = catalogRepostiroy;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepostiroy.findAll();
    }
}
