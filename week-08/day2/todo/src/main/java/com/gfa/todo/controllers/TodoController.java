package com.gfa.todo.controllers;

import com.gfa.todo.Todo;
import com.gfa.todo.interfaces.TodoRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"/list", "/"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        if (isActive == null || !isActive) {
            model.addAttribute("todos", todoRepository.findAll());
        } else if (isActive){
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> !a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", isNotDone);
        } else if (isActive) {
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", isNotDone);
        }
        return "todoslist";
    }
}