package com.gfa.todo;

import com.gfa.todo.repositories.TodoRepository;
import com.gfa.todo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private UserRepository userRepository;
    private TodoRepository todoRepository;

    public TodoApplication(UserRepository userRepository, TodoRepository todoRepository) {
        this.userRepository = userRepository;
        this.todoRepository = todoRepository;
    }


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        ApplicationUser user = new ApplicationUser();
//        user.setUsername("Petike");
//        user.setPassword("123");
//        userRepository.save(user);


//        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
//        todoRepository.save(new Todo("Dark necessities", false, true));
//        todoRepository.save(new Todo("Take the A train", true, false));
//        todoRepository.save(new Todo("Take me home", true, true));
//        todoRepository.save(new Todo("Girl from Ipanema", false, true));
//        todoRepository.save(new Todo("Don't mean a thing", false, true));
//        todoRepository.save(new Todo("Let's talk about sex", false, true));

    }
}
