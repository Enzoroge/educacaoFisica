package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.get();
		
	}
	
	public Usuario inserir(Usuario obj) {
	 return usuarioRepository.save(obj);
		
	}
	
	public void delete(Long id) {
		 usuarioRepository.deleteById(id);
	}
	
	public Usuario atualizar(Long id, Usuario obj) {
		Usuario entity = usuarioRepository.getReferenceById(id);
		atualizarData(entity, obj);
		return usuarioRepository.save(entity);
	}

	private void atualizarData(Usuario entity, Usuario obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		
		
	}

}
