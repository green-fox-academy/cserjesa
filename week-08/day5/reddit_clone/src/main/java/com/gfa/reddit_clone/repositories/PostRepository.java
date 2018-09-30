package com.gfa.reddit_clone.repositories;

import com.gfa.reddit_clone.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
