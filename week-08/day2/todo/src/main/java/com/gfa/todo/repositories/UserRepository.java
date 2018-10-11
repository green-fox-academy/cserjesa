package com.gfa.todo.repositories;

import com.gfa.todo.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
}
