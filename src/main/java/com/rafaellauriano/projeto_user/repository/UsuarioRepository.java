package com.rafaellauriano.projeto_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellauriano.projeto_user.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	

}
