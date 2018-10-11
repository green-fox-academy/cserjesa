package com.gfa.todo.controllers;

import com.gfa.todo.models.Todo;
import com.gfa.todo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/list", "/"})
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

    @GetMapping("/add")
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

    @GetMapping("/{id}/edit")
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
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String title, Model model) {
        model.addAttribute("todos", todoService.findTodoByTitle(title));
        return "todoslist";
    }

    @GetMapping("/api")
    @ResponseBody
    public List<Todo> listDTO(Model model) {
        todoService.findAll();
        return (List<Todo>) todoService.findAll();
    }

    @CrossOrigin("*")
    @ResponseBody
    @PostMapping("/api")
    public String saveDTO(@RequestBody(required = false) Todo todo, Model model) {
        todoService.save(todo);
        return "redirect:/";
    }
}