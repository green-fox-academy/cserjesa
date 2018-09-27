package com.gfa.todo.services;

import com.gfa.todo.models.Todo;

import java.util.List;
import java.util.Optional;


public interface TodoService {
    List<Todo> findTodoByTitle(String title);

    Iterable<Todo> findAll();

    Iterable<Todo> findActive();

    Iterable<Todo> findInactive();

    void save(Todo todo);

    void save(String title);

    Optional<Todo> findById(Long id);

    void delete(Todo todo);
}
