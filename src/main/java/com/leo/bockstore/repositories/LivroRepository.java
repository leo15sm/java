package com.leo.bockstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.bockstore.domain.Categoria;

@Repository
public interface LivroRepository extends JpaRepository<Categoria, Integer>{
	
}
