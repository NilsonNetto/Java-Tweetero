package com.tweetero.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.UserDTO;

@RestController
@RequestMapping()
public class UsersController {

  @PostMapping("/sign-up")
  public void create(@RequestBody UserDTO req) {
    System.out.println(req);
  }
}
