package com.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;

import com.quickpoll.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUsername(String username);
}
