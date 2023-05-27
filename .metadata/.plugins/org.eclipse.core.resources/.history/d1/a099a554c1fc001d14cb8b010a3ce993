package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Material;
import com.example.demo.service.MaterialService;

@RestController
@RequestMapping(value="/material")
public class MaterialController {
	
	@Autowired
	private MaterialService materialService;
	
	@GetMapping
	public ResponseEntity<List<Material>> findAll(){
	List<Material> list	 = materialService.findAll();
			return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Material> findById(@PathVariable Long id){
	Material obj = materialService.findById(id);
	return ResponseEntity.ok().body(obj);
}
}
