package com.tweetero.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.TweetDTO;
import com.tweetero.api.models.Tweet;
import com.tweetero.api.repositories.TweetRepository;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

  @Autowired
  private TweetRepository repository;

  @PostMapping
  public void create(@RequestBody TweetDTO req) {
    System.out.println("criando user");
    repository.save(new Tweet(req));
  }

  @GetMapping
  public List<Tweet> getAll() {
    System.out.println("pegou tudo");
    return repository.findAll();
  }

  @GetMapping("/{username}")
  public void getByUsername(@PathVariable String username) {
    System.out.println("pegou pelo user:" + username);
  }
}
