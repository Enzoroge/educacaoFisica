package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;

@RestController
@RequestMapping(value="pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> obj = pedidoService.findAll();
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id) {
		Pedido obj = pedidoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	

}
