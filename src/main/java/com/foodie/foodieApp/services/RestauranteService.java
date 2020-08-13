package com.foodie.foodieApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodie.foodieApp.entities.Restaurante;
import com.foodie.foodieApp.repositories.RestauranteRepository;

@Service
public class RestauranteService {

	@Autowired
	private RestauranteRepository repository;
	
	public List<Restaurante> findAll() {
		return repository.findAll();
	}
	
	public Restaurante findById(Integer id) {
		Optional<Restaurante> obj = repository.findById(id);
		return obj.get();
	}
	
	public Restaurante insert(Restaurante obj) {
		obj.setId(null);
		return repository.save(obj);
	}
}
