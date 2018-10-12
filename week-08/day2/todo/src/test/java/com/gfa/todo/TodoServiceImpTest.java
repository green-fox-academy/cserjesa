package com.gfa.todo;

import com.gfa.todo.controllers.TodoController;
import com.gfa.todo.models.Todo;
import com.gfa.todo.repositories.ApplicationUserRepository;
import com.gfa.todo.repositories.TodoRepository;
import com.gfa.todo.repositories.UserRepository;
import com.gfa.todo.services.TodoServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(TodoController.class)
@Import(TodoServiceImp.class)
//@AutoConfigureMockMvc
public class TodoServiceImpTest {

        @Autowired
        MockMvc mockMvc;

        @MockBean
        ApplicationUserRepository applicationUserRepository;

        @MockBean
        TodoRepository todoRepository;

        @MockBean
        UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findTodoByTitle() {
        Todo todo = new Todo();
        todo.setTitle("TesztTodo");

        when(todoRepository.findAll()).thenReturn(Arrays.asList(todo));

        try {
            mockMvc.perform(get("/api").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTQwMTE2MzYzfQ.QV2C57b-QFwuDyZtMn76wGuHdg7jWB5EQwSwJ-AgUia0i_xmMkO_kzJpqW4IL-dzPeyIiNn0hmpn7GtS9eKBNQ").header("Content-Type",""))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].title", is("TesztTodo")));
//                    .andDo(result -> System.out.println(result.getResponse().getStatus()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    @Test
//    public void findAll() {
//    }application/json
//
//    @Test
//    public void findActive() {
//    }
//
//    @Test
//    public void findInactive() {
//    }
//
//    @Test
//    public void save() {
//    }
//
//    @Test
//    public void save1() {
//    }
//
//    @Test
//    public void findById() {
//    }
//
//    @Test
//    public void delete() {
//    }
}