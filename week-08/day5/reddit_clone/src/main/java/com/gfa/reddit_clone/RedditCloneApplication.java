package com.gfa.reddit_clone;

import com.gfa.reddit_clone.models.Post;
import com.gfa.reddit_clone.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditCloneApplication implements CommandLineRunner {
    private PostRepository postRepository;

    public RedditCloneApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditCloneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("Tájtl", "http://valami.valahol.com"));
        postRepository.save(new Post("Tájtl2", "http://valami.valahol.com"));
        postRepository.save(new Post("Tájtl3", "http://valami.valahol.com"));
        postRepository.save(new Post("Titel4", "http://valami.valahol.com"));
        postRepository.save(new Post("Imja5", "http://valami.valahol.com"));
        postRepository.save(new Post("Title6", "http://valami.valahol.com"));
    }
}
