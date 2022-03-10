package com.example.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springredditclone.model.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

}
