package com.bancolombia.app.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Worker;
import com.bancolombia.app.services.IService;


@RestController
@RequestMapping("/worker")//http://ip:port/worker
public class MicroController {
	@Autowired
	private IService service;

	@PostMapping //POST
	public ResponseEntity<String> insert(@RequestBody Worker worker){
		try {
			if(service.insert(worker)) {
				
				return new ResponseEntity<String>("insertado", HttpStatus.CREATED);
			}
			
			return new ResponseEntity<String>("no insertado", HttpStatus.BAD_REQUEST);
		}catch(Exception ex) {
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<Worker> findById(@PathVariable("id") long id){
		try {
		    
			return new ResponseEntity(null)<Worker>(service.findById(id), HttpStatus.OK);
			
			
			
		}catch(NoSuchElementException ex) {
		   return new ResponseEntity<Worker>(HttpStatus.NOT_FOUND);
		}catch(Exception ex) {
			
			return new ResponseEntity<Worker>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") long id){
		try {
			if(service.deleteById(id)) {
				return new ResponseEntity<String>("eliminado", HttpStatus.OK);
			}
			return new ResponseEntity<String>("no existe", HttpStatus.NOT_FOUND);
			
		}catch(Exception ex) {
			
			return new ResponseEntity<String>("error servidor", 
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Worker worker){
		try {
			if(service.update(worker)) {
				return new ResponseEntity<String>("actualizado",HttpStatus.OK);
			}
			return new ResponseEntity<String>("no existe", HttpStatus.NOT_FOUND);
			
		}catch(Exception ex) {
			 return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	
	@GetMapping
	public ResponseEntity<List<Worker>> getAll(){
		return new ResponseEntity<List<Worker>>(service.getAll(), HttpStatus.OK);
	}
	
}

