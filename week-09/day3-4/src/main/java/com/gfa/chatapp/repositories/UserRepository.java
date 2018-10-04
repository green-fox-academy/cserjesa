package com.gfa.chatapp.repositories;

import com.gfa.chatapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
