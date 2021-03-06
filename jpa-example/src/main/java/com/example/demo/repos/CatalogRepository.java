package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.Catalog;
@Repository
public interface CatalogRepository<T extends Catalog> 
                                 extends JpaRepository<T,Integer> {

	Catalog findByDescription(String desc);
}
