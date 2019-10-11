package com.gm.examples.springbootsecurityrestdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.gm.examples.springbootsecurityrestdata.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}