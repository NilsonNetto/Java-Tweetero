package com.tweetero.api.models;

import com.tweetero.api.dtos.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tweet {

  public Tweet(TweetDTO data) {
    this.username = data.username();
    this.avatar = data.avatar();
    this.text = data.text();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20, nullable = false)
  private String username;

  @Column(nullable = false)
  private String avatar;

  @Column(nullable = false)
  private String text;
}
