package com.gfa.todo;

import com.gfa.todo.interfaces.TodoRepository;
import com.gfa.todo.interfaces.UserRepository;
import com.gfa.todo.models.Todo;
import com.gfa.todo.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private UserRepository userRepository;
    private TodoRepository todoRepository;

    public TodoApplication(UserRepository userRepository, TodoRepository todoRepository) {
        this.userRepository = userRepository;
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("Petike");
        user.setAge(29);

        userRepository.save(user);
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Dark necessities", false, true));
        todoRepository.save(new Todo("Take the A train", true, false));
        todoRepository.save(new Todo("Take me home", true, true));
        todoRepository.save(new Todo("Girl from Ipanema", false, true));
        todoRepository.save(new Todo("Don't mean a thing", false, true));
        todoRepository.save(new Todo("Let's talk about sex", false, true));

    }


}
