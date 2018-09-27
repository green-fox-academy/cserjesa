package com.gfa.todo.interfaces;

import com.gfa.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByTitle(String title);
}
