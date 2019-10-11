package com.gm.examples.springbootsecurityrestdata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.examples.springbootsecurityrestdata.domain.User;
import com.gm.examples.springbootsecurityrestdata.repository.UserRepository;
import com.gm.examples.springbootsecurityrestdata.service.GenericUserService;

@Service
public class GenericUserServiceImpl implements GenericUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}