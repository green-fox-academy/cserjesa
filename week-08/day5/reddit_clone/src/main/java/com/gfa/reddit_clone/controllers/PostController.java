package com.gfa.reddit_clone.controllers;

import com.gfa.reddit_clone.models.Post;
import com.gfa.reddit_clone.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = {"/posts", "/"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("posts", postService.findAll());
        }
        return "index";
    }

    @PostMapping("/{id}/upvote")
    public String upvote(Model model, @PathVariable Long id) {
        postService.upVote(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/downvote")
    public String downvote(Model model, @PathVariable Long id) {
        postService.downVote(id);
        return "redirect:/";
    }

    @RequestMapping("/submit")
    public String submit(Model model) {
            return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(Model model, Post post) {
        postService.save(post);
        return "redirect:/";
    }
}
