package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Worker;



@Component
public class ProductRepository {
	private List<Worker> lista=new ArrayList<>();
	
	
	
	public boolean insert(Worker item) {
		return lista.add(item);
	}
	public List<Worker> getAll(){
		return lista;
	}
}
