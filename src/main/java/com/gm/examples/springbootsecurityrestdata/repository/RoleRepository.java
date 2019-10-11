package com.gm.examples.springbootsecurityrestdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.gm.examples.springbootsecurityrestdata.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
}