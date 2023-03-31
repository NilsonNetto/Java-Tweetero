package com.tweetero.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.UserDTO;
import com.tweetero.api.models.User;
import com.tweetero.api.repositories.UserRepository;

@RestController
@RequestMapping()
public class UsersController {

  @Autowired
  private UserRepository repository;

  @PostMapping("/sign-up")
  public void create(@RequestBody UserDTO req) {
    System.out.println(req);
    repository.save(new User(req));
  }
}
