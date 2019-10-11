package com.gm.examples.springbootsecurityrestdata.service;

import java.util.List;

import com.gm.examples.springbootsecurityrestdata.domain.User;

public interface GenericUserService {

	User findByUsername(String username);

	List<User> findAllUsers();

}