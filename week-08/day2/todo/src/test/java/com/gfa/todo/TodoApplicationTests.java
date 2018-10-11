package com.gfa.todo;

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
public class TodoApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void signup() throws Exception {
        mockMvc.perform(post("/users/sign-up").header("Content-Type","application/json").content("{\n" +
                "    \"username\": \"Dani\",\n" +
                "    \"password\": \"password\"\n" +
                "}"))
                .andExpect(status().isOk());
    }

    @Test
    public void login() throws Exception {
        mockMvc.perform(post("/login").content("{\n" +
                "    \"username\": \"Dani\",\n" +
                "    \"password\": \"password\"\n" +
                "}"))
                .andExpect(status().isOk());
    }

    @Test
    public void homePageLoads() throws Exception {
        mockMvc.perform(get("/").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTQwMTE2MzYzfQ.QV2C57b-QFwuDyZtMn76wGuHdg7jWB5EQwSwJ-AgUia0i_xmMkO_kzJpqW4IL-dzPeyIiNn0hmpn7GtS9eKBNQ"))
                .andExpect(status().isOk());
    }

    @Test
    public void allusers() throws Exception {
        mockMvc.perform(get("/users/all").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTQwMTE2MzYzfQ.QV2C57b-QFwuDyZtMn76wGuHdg7jWB5EQwSwJ-AgUia0i_xmMkO_kzJpqW4IL-dzPeyIiNn0hmpn7GtS9eKBNQ"))
                .andExpect(status().isOk());
    }

}
