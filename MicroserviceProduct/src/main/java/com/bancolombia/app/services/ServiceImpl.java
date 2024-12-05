package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.ProductRepository;
import com.bancolombia.app.entities.Product;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private ProductRepository repositorio;

	@Override
	public boolean insert(Product item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Product> getAll() {
		return repositorio.getAll();
	}

}
