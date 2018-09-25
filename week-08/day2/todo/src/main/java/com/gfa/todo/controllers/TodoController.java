package com.gfa.todo.controllers;

import com.gfa.todo.Todo;
import com.gfa.todo.interfaces.TodoRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"/list", "/"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else if (isActive) {
            model.addAttribute("todos", Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> !a.isDone())
                    .collect(Collectors.toList()));
        } else if (!isActive) {
            model.addAttribute("todos", Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> a.isDone())
                    .collect(Collectors.toList()));
        }
        return "todoslist";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        return "add";
    }

    @PostMapping("/add")
    public String addPost(String title, Model model) {
        todoRepository.save(new Todo(title));
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String deletePost(Model model, @PathVariable Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
        return "redirect:/";
    }

    @RequestMapping("/{id}/edit")
    public String edit(Model model, @PathVariable Long id) {
        model.addAttribute("title", todoRepository.findById(id));
        return "/{id}/edit";
    }

    @RequestMapping("/edit")
    public String edit2(Model model, @PathVariable Long id) {
        model.addAttribute("title", todoRepository.findById(id));
        return "/{id}/edit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(Model model, @PathVariable Long id) {
 //       todoRepository.save(new Todo(title));
        return "/edit";
    }

}