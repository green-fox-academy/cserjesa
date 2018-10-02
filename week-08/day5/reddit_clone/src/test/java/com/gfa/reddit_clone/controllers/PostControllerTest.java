package com.gfa.reddit_clone.controllers;

import com.gfa.reddit_clone.services.PostService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class PostControllerTest {
    private PostService mockPostService;

    @Before
    public void setUp() throws Exception {
        mockPostService = mock(PostService.class);
    }

    @Test
    public void list() {
        // Arrange
        PostController controller = new PostController(mockPostService);
        Model model = null;

        // Act
        String result = controller.list(true, model);
        // Assert
        assertEquals("index", result);
    }

    @Test
    public void upvote() {
    }

    @Test
    public void downvote() {
    }

    @Test
    public void submit() {
    }

    @Test
    public void submitPost() {
    }
}