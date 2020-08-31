package com.app.server.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.server.bo.Product;
import com.app.server.dao.StoreProductDao;

@RestController
@RequestMapping("/api")
public class ProductStoreController {	
	
	@Autowired
	private StoreProductDao storeProductDao;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct(HttpServletRequest req){
		return ResponseEntity.ok(storeProductDao.findAll());
	}
}
