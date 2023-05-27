package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Long>{

}
