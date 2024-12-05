package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Product;

@Component
public class ProductRepository {
	private List<Product> lista=new ArrayList<>();
	
	
	
	public boolean insert(Product item) {
		return lista.add(item);
	}
	public List<Product> getAll(){
		return lista;
	}
}
