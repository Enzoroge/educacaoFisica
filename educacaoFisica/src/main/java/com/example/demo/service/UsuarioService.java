package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.service.exceptions.DatabaseException;
import com.example.demo.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
	public Usuario inserir(Usuario obj) {
	 return usuarioRepository.save(obj);
		
	}
	
	public void delete(Long id) {
		try {
		 usuarioRepository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Usuario atualizar(Long id, Usuario obj) {
		try {
		Usuario entity = usuarioRepository.getReferenceById(id);
		atualizarData(entity, obj);
		return usuarioRepository.save(entity);
	}catch (EntityNotFoundException e) {
		throw new ResourceNotFoundException(id);
	}
	}

	private void atualizarData(Usuario entity, Usuario obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		
		
	}

}
