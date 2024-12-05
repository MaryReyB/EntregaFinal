package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Product;

public interface IService {
	
	boolean insert(Product item);
	List<Product> getAll();

}
