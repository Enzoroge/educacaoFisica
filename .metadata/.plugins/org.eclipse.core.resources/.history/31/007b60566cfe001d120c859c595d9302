package com.example.demo.config;


import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.model.Material;
import com.example.demo.model.Pedido;
import com.example.demo.model.Usuario;
import com.example.demo.repositories.MaterialRepository;
import com.example.demo.repositories.PedidoRepository;
import com.example.demo.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private MaterialRepository materialRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Usuario u = new Usuario(0, "Rogerio", "rogerio@yahoo", 12345, null);
		Usuario u2 = new Usuario(0, "Fabianne Barreto", "fabianne@yahoo.com", 123456, null);
		usuarioRepository.saveAll(Arrays.asList(u, u2));
		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u);
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u);
		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Material m = new Material(null, "Tenis", 3);
		Material m2 = new Material(null,"Bola de voley", 10);
		materialRepository.saveAll(Arrays.asList(m, m2));
		
	}
	
	
	
	
	
	

}
