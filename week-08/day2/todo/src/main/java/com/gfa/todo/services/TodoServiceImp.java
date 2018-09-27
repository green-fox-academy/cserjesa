package com.gfa.todo.services;

import com.gfa.todo.interfaces.TodoRepository;
import com.gfa.todo.models.Todo;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TodoServiceImp implements TodoService {
    private TodoRepository todoRepository;

    public TodoServiceImp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findTodoByTitle(String title) {

        return Streamable.of(todoRepository.findAll()).stream()
                .filter(a -> a.getTitle().toLowerCase().contains(title))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Iterable<Todo> findActive() {
        return Streamable.of(todoRepository.findAll()).stream()
                .filter(a -> !a.isDone())
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Todo> findInactive() {
        return Streamable.of(todoRepository.findAll()).stream()
                .filter(Todo::isDone)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void save(String title) {
        todoRepository.save(new Todo(title));
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void delete(Todo todo) {
        todoRepository.delete(todo);
    }
}
