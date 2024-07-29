package com.aulanelio.usuariodepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulanelio.usuariodepto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
