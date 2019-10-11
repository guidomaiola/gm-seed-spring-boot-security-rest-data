package com.gm.examples.springbootsecurityrestdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gm.examples.springbootsecurityrestdata.domain.User;
import com.gm.examples.springbootsecurityrestdata.service.GenericUserService;

@RestController
@RequestMapping("/api")
public class ResourceController {

    @Autowired
    private GenericUserService userService;

//    @RequestMapping(value ="/user/")
//    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
//    public User getUser(Long id){
//        return userService.findUserById(id);
//    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }
}
