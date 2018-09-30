package com.gfa.reddit_clone.services;

import com.gfa.reddit_clone.models.Post;
import com.gfa.reddit_clone.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImp implements PostService {
    public final PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void upVote(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setPoint(post.getPoint() + 1);
            postRepository.save(post);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void downVote(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setPoint(post.getPoint() - 1);
            postRepository.save(post);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }
}
