package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.ProductRepository;
import com.bancolombia.app.entities.Worker;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private ProductRepository repositorio;

	@Override
	public boolean insert(Worker item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Worker> getAll() {
		return repositorio.getAll();
	}

	@Override
	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Worker worker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Worker findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
