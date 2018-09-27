package com.gfa.todo.interfaces;

import com.gfa.todo.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}
