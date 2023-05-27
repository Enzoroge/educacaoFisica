package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping(value="usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = usuarioService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		Usuario obj = usuarioService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
