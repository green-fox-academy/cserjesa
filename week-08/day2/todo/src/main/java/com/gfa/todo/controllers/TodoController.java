package com.gfa.todo.controllers;

import com.gfa.todo.interfaces.TodoRepository;
import com.gfa.todo.models.Todo;
import com.gfa.todo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoRepository todoRepository, TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/list", "/"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.findAll());
        } else if (isActive) {
            model.addAttribute("todos", todoService.findActive());
        } else if (!isActive) {
            model.addAttribute("todos", todoService.findInactive());
        }
        return "todoslist";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        return "add";
    }

    @PostMapping("/add")
    public String addPost(String title, Model model) {
        todoService.save(title);
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String deletePost(Model model, @PathVariable Long id) {
        Optional<Todo> todo = todoService.findById(id);
        if (todo.isPresent()) {
            todoService.delete(todo.get());
        }
        return "redirect:/";
    }

    @RequestMapping("/{id}/edit")
    public String edit(Model model, @PathVariable Long id) {
        Optional<Todo> todo = todoService.findById(id);
        if (todo.isPresent()) {
            model.addAttribute("todo", todo.get());
            return "edit";
        }
        return "redirect:/404";
    }

    @PostMapping("/{id}/edit")
    public String editPost(Model model, @PathVariable Long id, Todo todo) {
        todoService.save(todo);
        String java = new String();

        return "redirect:/";
    }

    @RequestMapping("/search")
    public String search(@RequestParam(required = false) String title, Model model) {
        model.addAttribute("todos", todoService.findTodoByTitle(title));
        return "todoslist";
    }
}