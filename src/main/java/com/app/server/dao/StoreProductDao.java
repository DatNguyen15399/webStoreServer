package com.app.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.server.bo.Product;

@Repository
public interface StoreProductDao extends JpaRepository<Product, Long>{	
}
