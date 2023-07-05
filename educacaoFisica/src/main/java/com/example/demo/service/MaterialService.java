package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Material;
import com.example.demo.repositories.MaterialRepository;

@Service
public class MaterialService {
	
	@Autowired
	private MaterialRepository materialRepository;
	
	public List<Material> findAll(){
		return materialRepository.findAll();
	}
	
	public Material findById(Long id) {
		Optional<Material> obj	= materialRepository.findById(id);
		return obj.get();
	}
	
	public Material inserir(Material obj) {
		return materialRepository.save(obj);
	}

}
