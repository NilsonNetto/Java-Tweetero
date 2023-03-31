package com.tweetero.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.api.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
