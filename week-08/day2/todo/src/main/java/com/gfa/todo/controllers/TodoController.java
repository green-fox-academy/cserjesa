package com.gfa.todo.controllers;

import com.gfa.todo.interfaces.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"/list", "/"})
    public String list(@RequestParam(required = false) Boolean active, Model model) {
        if (active != null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else if (active = true) {
            model.addAttribute("todos",)
        }
        return "todoslist";
    }
}