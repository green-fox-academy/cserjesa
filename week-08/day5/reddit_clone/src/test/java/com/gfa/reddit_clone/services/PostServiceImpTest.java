package com.gfa.reddit_clone.services;

import com.gfa.reddit_clone.models.Post;
import com.gfa.reddit_clone.repositories.PostRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.util.Streamable;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PostServiceImpTest {
    private PostRepository mockPostRepository;

    @Before
    public void setUp() throws Exception {
        mockPostRepository = mock(PostRepository.class);

    }

    @Test
    public void findAll() {
        // Arrange
        Post post = new Post();
        when(mockPostRepository.findAll()).thenReturn(Arrays.asList(post));
        PostServiceImp service = new PostServiceImp(mockPostRepository);
        // Act
        Iterable result = service.findAll();
        Optional first = Streamable.of(result).stream()
                .findFirst();
        // Assert
        assertEquals(post, first.get());
    }

    @Test
    public void findById() {
        // Arrange
        Post post = new Post("TesztPost", "http://valami.com");
        PostServiceImp service = new PostServiceImp(mockPostRepository);
        when(mockPostRepository.findById(0L)).thenReturn(Optional.ofNullable(post));
        // Act
        Optional<Post> testPost = service.findById(0L);
        // Assert
        assertEquals("TesztPost", testPost.get().getTitle());
        assertEquals("http://valami.com", testPost.get().getUrl());
    }

    @Test
    public void upVote() {
        // Arrange
        Post post = new Post("TesztPost", "http://valami.com");
        PostServiceImp service = new PostServiceImp(mockPostRepository);
        when(mockPostRepository.findById(0L)).thenReturn(Optional.ofNullable(post));
        // Act
        service.upVote(0L);
        service.upVote(0L);
        // Assert
        assertEquals((Integer) 2, post.getPoint());
    }

    @Test
    public void downVote() {
        // Arrange
        Post post = new Post("TesztPost", "http://valami.com");
        PostServiceImp service = new PostServiceImp(mockPostRepository);
        when(mockPostRepository.findById(0L)).thenReturn(Optional.ofNullable(post));
        // Act
        service.downVote(0L);
        service.downVote(0L);
        // Assert
        assertEquals(-2, (int) post.getPoint());
    }

    @Test
    public void save() {

        when(mockPostRepository.save(any(Post.class))).thenReturn(new Post());
        Post post = new Post();
        PostServiceImp service = new PostServiceImp(mockPostRepository);
        // Act
        service.save(post);
        // Assert
        verify(mockPostRepository, times(1)).save(post);
    }
}