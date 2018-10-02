package com.gfa.reddit_clone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RedditApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void homePageLoads() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void submitLoads() throws Exception {
        mockMvc.perform(get("/submit"))
                .andExpect(status().isOk());
    }

    @Test
    public void upVote() throws Exception {
        mockMvc.perform(post("/1/upvote"))
                .andExpect(status().is3xxRedirection());
    }
}
