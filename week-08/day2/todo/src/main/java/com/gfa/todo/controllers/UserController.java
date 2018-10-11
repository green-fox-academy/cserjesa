package com.gfa.todo.controllers;

import com.gfa.todo.models.ApplicationUser;
import com.gfa.todo.repositories.ApplicationUserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(ApplicationUserRepository applicationUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
    }

    @GetMapping("/all")
    public List<ApplicationUser> loadAll() {
        return (List<ApplicationUser>) applicationUserRepository.findAll();
    }

    @RequestMapping("/whoami")
    public ApplicationUser applicationUser(Principal user) {
        return applicationUserRepository.findByUsername(user.getName());
    }

}