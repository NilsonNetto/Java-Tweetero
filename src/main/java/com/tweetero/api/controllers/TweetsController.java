package com.tweetero.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.TweetDTO;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

  @PostMapping
  public void create(@RequestBody TweetDTO req) {
    System.out.println("creando user");
  }

  @GetMapping
  public void getAll() {
    System.out.println("pegou tudo");

  }

  @GetMapping("/{username}")
  public void getByUsername(@PathVariable String username) {
    System.out.println("pegou pelo user:" + username);
  }
}
