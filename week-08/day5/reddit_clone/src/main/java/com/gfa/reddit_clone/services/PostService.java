package com.gfa.reddit_clone.services;

import com.gfa.reddit_clone.models.Post;

import java.util.Optional;

public interface PostService {
    Iterable findAll();

    Optional<Post> findById(Long id);

    void upVote(Long id);

    void downVote(Long id);

    void save(Post post);
}
