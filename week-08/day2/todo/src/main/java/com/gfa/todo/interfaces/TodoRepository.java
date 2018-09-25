package com.gfa.todo.interfaces;

import com.gfa.todo.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TodoRepository extends CrudRepository<Todo, Long> {
}
